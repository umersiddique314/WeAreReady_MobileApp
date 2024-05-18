package rk.apenex.flightapp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rk.apenex.flightapp.models.Api1Response;
import rk.apenex.flightapp.models.Api2Response;

public interface FlightApi {
    @GET("statusTray")
    Call<Api1Response> getFlight1Data(@Query("fig2") boolean fig2);

    @GET("flight")
    Call<Api2Response> getFlight2Data();
}

