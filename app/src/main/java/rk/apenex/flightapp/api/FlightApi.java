package rk.apenex.flightapp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import rk.apenex.flightapp.models.Api1Response;
import rk.apenex.flightapp.models.Api2Response;

public interface FlightApi {
    @GET("flight1.php")
    Call<Api1Response> getFlight1Data();

    @GET("flight2.php")
    Call<Api2Response> getFlight2Data();
}

