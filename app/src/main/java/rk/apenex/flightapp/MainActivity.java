package rk.apenex.flightapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.IOException;

import rk.apenex.flightapp.api.FlightApiClient;
import rk.apenex.flightapp.models.Api1Response;
import rk.apenex.flightapp.models.Api2Response;
import rk.apenex.flightapp.models.FinalDataModel;
import rk.apenex.flightapp.utils.NetworkUtils;
import rk.apenex.flightapp.utils.SerializationUtils;
import rk.apenex.flightapp.utils.TimeUtils;

public class MainActivity extends AppCompatActivity {
    private FlightApiClient flightApiClient;
    private boolean isUsingApi1 = true;
    private TextView apiName_tv;
    private ProgressBar apiProgress_pb;
    private Button apiSend_btn;
    private DatabaseReference databaseReference;
    private SharedPreferences prefs;
    private boolean isServiceRunning;
    private SharedPreferences.Editor editor;

    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            // Call your function here
            if (NetworkUtils.isInternetConnected(MainActivity.this)) {
                if (isUsingApi1) {
                    fetchDataFromApi1();
                } else {
                    fetchDataFromApi2();
                }
            } else {
                checkNetworkState();
            }
            // Schedule the next execution after 10 seconds
            handler.postDelayed(this, 10000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        if (isServiceRunning) {
            apiProgress_pb.setVisibility(View.VISIBLE);
            apiSend_btn.setText("Stop Sending");
            checkNetworkState();
        } else {
            apiProgress_pb.setVisibility(View.GONE);
            apiSend_btn.setText("Start Sending");
            stopRepeatedExecution();
        }

        apiSend_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startForegroundService();
            }
        });
    }


    public void checkNetworkState() {
        if (NetworkUtils.isInternetConnected(MainActivity.this)) {
            if (isUsingApi1) {
                fetchDataFromApi1();
            } else {
                fetchDataFromApi2();
            }
        } else {
            stopRepeatedExecution();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopRepeatedExecution();
    }

    private void startRepeatedExecution() {
        handler.postDelayed(runnable, 10000);
    }

    private void stopRepeatedExecution() {
        handler.removeCallbacks(runnable);
    }

    private void fetchDataFromApi1() {
        // Fetch data from Flight API 1
        flightApiClient.getFlight1Data(new FlightApiClient.FlightApiCallback<Api1Response>() {
            @Override
            public void onResponse(Api1Response response) {

                FinalDataModel finalDataModel = new FinalDataModel(
                        (TimeUtils.getCurrentTime() + TimeUtils.getCurrentTimeZone()),
                        response.getResponseData().getFlightInfo().getDepartureAirportCode(),
                        response.getResponseData().getFlightInfo().getDestinationAirportCode(),
                        String.valueOf(doubleToInt(response.getResponseData().getFlightInfo().getAltitude())),
                        convertToHoursMinutes(response.getResponseData().getSystemInfo().getTimeToLand())
                );

                apiName_tv.setText("CALLING: API 1");

                sendDatatoWearOsApp(finalDataModel);

                stopRepeatedExecution();
                startRepeatedExecution();
            }

            @Override
            public void onFailure(String errorMessage) {

                isUsingApi1 = false;

                apiName_tv.setText("CALLING: API 2");

                stopRepeatedExecution();
                startRepeatedExecution();
            }
        });
    }

    private void sendDatatoWearOsApp(FinalDataModel finalDataModel) {
        try {
            byte[] serializedData = SerializationUtils.serialize(finalDataModel);
            PutDataMapRequest putDataMapRequest = PutDataMapRequest.create("/data_path");
            putDataMapRequest.getDataMap().putByteArray("model", serializedData);
            Wearable.getDataClient(getApplicationContext()).putDataItem(putDataMapRequest.asPutDataRequest());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int doubleToInt(double value) {
        // Cast the double value to an integer
        return (int) value;
    }

    private static String convertToHoursMinutes(int minutes) {
        // Calculate hours and minutes
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // Build the string in the format "XhYm"
        StringBuilder result = new StringBuilder();
        if (hours > 0) {
            result.append(hours).append("h");
        }
        if (remainingMinutes > 0) {
            result.append(remainingMinutes).append("m");
        }

        return result.toString();
    }

    private void fetchDataFromApi2() {
        // Fetch data from Flight API 2
        flightApiClient.getFlight2Data(new FlightApiClient.FlightApiCallback<Api2Response>() {
            @Override
            public void onResponse(Api2Response response) {

                FinalDataModel finalDataModel = new FinalDataModel(
                        (TimeUtils.getCurrentTime() + TimeUtils.getCurrentTimeZone()),
                        response.getOrigin(),
                        response.getDestination(),
                        String.valueOf(response.getAltitude()),
                        convertToHoursMinutes(response.getTimeToGo())
                );

                apiName_tv.setText("CALLING: API 2");

                sendDatatoWearOsApp(finalDataModel);

                stopRepeatedExecution();
                startRepeatedExecution();
            }

            @Override
            public void onFailure(String errorMessage) {

                isUsingApi1 = true;

                apiName_tv.setText("CALLING: API 1");

                stopRepeatedExecution();
                startRepeatedExecution();
            }
        });
    }

    private void initViews() {
        // Initialize the Retrofit client
        flightApiClient = new FlightApiClient();

        apiName_tv = findViewById(R.id.apiName_tv);

        apiProgress_pb = findViewById(R.id.apiProgress_pb);

        apiSend_btn = findViewById(R.id.apiSend_btn);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("ApiData");

        prefs = getSharedPreferences("MyConfig", MODE_PRIVATE);
        isServiceRunning = prefs.getBoolean("serviceRunning", false);
        editor = prefs.edit();

        // Toggle the value of serviceRunning
        editor.putBoolean("serviceRunning", isServiceRunning);
        editor.apply();
    }

    private void startForegroundService() {
        isServiceRunning = prefs.getBoolean("serviceRunning", false);
        if (isServiceRunning) {
            apiProgress_pb.setVisibility(View.GONE);
            apiSend_btn.setText("Start Sending");
            editor.putBoolean("serviceRunning", false);
            stopRepeatedExecution();
        } else {
            apiProgress_pb.setVisibility(View.VISIBLE);
            apiSend_btn.setText("Stop Sending");
            editor.putBoolean("serviceRunning", true);
            checkNetworkState();
        }
        editor.apply();
    }
}