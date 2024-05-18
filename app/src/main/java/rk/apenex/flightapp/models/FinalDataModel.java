package rk.apenex.flightapp.models;

import android.os.Bundle;

import java.io.Serializable;

public class FinalDataModel implements Serializable {
    String currentTime, originAirport, destinationAirport, currentAltitude, timeToGo;

    public FinalDataModel() {
    }

    public FinalDataModel(String currentTime, String originAirport, String destinationAirport, String currentAltitude, String timeToGo) {
        this.currentTime = currentTime;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.currentAltitude = currentAltitude;
        this.timeToGo = timeToGo;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(String currentAltitude) {
        this.currentAltitude = currentAltitude;
    }

    public String getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(String timeToGo) {
        this.timeToGo = timeToGo;
    }

}
