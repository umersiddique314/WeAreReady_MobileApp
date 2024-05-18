package rk.apenex.flightapp.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Api2Response implements Serializable {
    @SerializedName("timestamp")
    private String timestamp;
    @SerializedName("eta")
    private String eta;
    @SerializedName("flightDuration")
    private int flightDuration;
    @SerializedName("flightNumber")
    private String flightNumber;
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("noseId")
    private String noseId;
    @SerializedName("paState")
    private String paState;
    @SerializedName("vehicleId")
    private String vehicleId;
    @SerializedName("destination")
    private String destination;
    @SerializedName("origin")
    private String origin;
    @SerializedName("flightId")
    private String flightId;
    @SerializedName("airspeed")
    private int airspeed;
    @SerializedName("airTemperature")
    private int airTemperature;
    @SerializedName("altitude")
    private int altitude;
    @SerializedName("distanceToGo")
    private int distanceToGo;
    @SerializedName("doorState")
    private String doorState;
    @SerializedName("groundspeed")
    private int groundspeed;
    @SerializedName("heading")
    private int heading;
    @SerializedName("timeToGo")
    private int timeToGo;
    @SerializedName("wheelWeightState")
    private String wheelWeightState;

    // Add your constructors, getters, and setters here

    public Api2Response() {
    }

    public Api2Response(String timestamp, String eta, int flightDuration, String flightNumber, double latitude, double longitude, String noseId, String paState, String vehicleId, String destination, String origin, String flightId, int airspeed, int airTemperature, int altitude, int distanceToGo, String doorState, int groundspeed, int heading, int timeToGo, String wheelWeightState) {
        this.timestamp = timestamp;
        this.eta = eta;
        this.flightDuration = flightDuration;
        this.flightNumber = flightNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.noseId = noseId;
        this.paState = paState;
        this.vehicleId = vehicleId;
        this.destination = destination;
        this.origin = origin;
        this.flightId = flightId;
        this.airspeed = airspeed;
        this.airTemperature = airTemperature;
        this.altitude = altitude;
        this.distanceToGo = distanceToGo;
        this.doorState = doorState;
        this.groundspeed = groundspeed;
        this.heading = heading;
        this.timeToGo = timeToGo;
        this.wheelWeightState = wheelWeightState;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getNoseId() {
        return noseId;
    }

    public void setNoseId(String noseId) {
        this.noseId = noseId;
    }

    public String getPaState() {
        return paState;
    }

    public void setPaState(String paState) {
        this.paState = paState;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getAirspeed() {
        return airspeed;
    }

    public void setAirspeed(int airspeed) {
        this.airspeed = airspeed;
    }

    public int getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getDistanceToGo() {
        return distanceToGo;
    }

    public void setDistanceToGo(int distanceToGo) {
        this.distanceToGo = distanceToGo;
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }

    public int getGroundspeed() {
        return groundspeed;
    }

    public void setGroundspeed(int groundspeed) {
        this.groundspeed = groundspeed;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(int timeToGo) {
        this.timeToGo = timeToGo;
    }

    public String getWheelWeightState() {
        return wheelWeightState;
    }

    public void setWheelWeightState(String wheelWeightState) {
        this.wheelWeightState = wheelWeightState;
    }
}


