package rk.apenex.flightapp.api;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rk.apenex.flightapp.models.Api1Response;
import rk.apenex.flightapp.models.Api2Response;

public class FlightApiClient {

    private FlightApi flightApi;

    public FlightApiClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://wifi.inflightinternet.com/abp/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        flightApi = retrofit.create(FlightApi.class);
    }

    public void getFlight1Data(final FlightApiCallback<Api1Response> callback) {
        flightApi.getFlight1Data(true).enqueue(new Callback<Api1Response>() {
            @Override
            public void onResponse(Call<Api1Response> call, Response<Api1Response> response) {
                if (response.isSuccessful()) {
                    callback.onResponse(response.body());
                } else {
                    callback.onFailure("Failed to get data from Flight API 1");
                }
            }

            @Override
            public void onFailure(Call<Api1Response> call, Throwable t) {
                callback.onFailure(t.getMessage());
            }
        });
    }

    public void getFlight2Data(final FlightApiCallback<Api2Response> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.aainflight.com/api/v1/connectivity/viasat/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FlightApi flightApi = retrofit.create(FlightApi.class);
        flightApi.getFlight2Data().enqueue(new Callback<Api2Response>() {
            @Override
            public void onResponse(Call<Api2Response> call, Response<Api2Response> response) {
                if (response.isSuccessful()) {
                    callback.onResponse(response.body());
                } else {
                    callback.onFailure("Failed to get data from Flight API 2");
                }
            }

            @Override
            public void onFailure(Call<Api2Response> call, Throwable t) {
                callback.onFailure(t.getMessage());
            }
        });
    }

    public interface FlightApiCallback<T> {
        void onResponse(T response);

        void onFailure(String errorMessage);
    }
}
