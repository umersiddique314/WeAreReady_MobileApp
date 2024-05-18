package rk.apenex.flightapp.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Api1Response implements Serializable {
    @SerializedName("Response")
    private ResponseData responseData;

    public ResponseData getResponseData() {
        return responseData;
    }

    public static class ResponseData {
        @SerializedName("status")
        private int status;
        @SerializedName("flightInfo")
        private FlightInfo flightInfo;
        @SerializedName("gogoFacts")
        private String gogoFacts;
        @SerializedName("serviceInfo")
        private ServiceInfo serviceInfo;
        @SerializedName("ipAddress")
        private String ipAddress;
        @SerializedName("macAddress")
        private String macAddress;
        @SerializedName("systemInfo")
        private SystemInfo systemInfo;
        @SerializedName("device_iid")
        private String deviceIid;

        public int getStatus() {
            return status;
        }

        public FlightInfo getFlightInfo() {
            return flightInfo;
        }

        public String getGogoFacts() {
            return gogoFacts;
        }

        public ServiceInfo getServiceInfo() {
            return serviceInfo;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public String getMacAddress() {
            return macAddress;
        }

        public SystemInfo getSystemInfo() {
            return systemInfo;
        }

        public String getDeviceIid() {
            return deviceIid;
        }
    }

    public static class FlightInfo {
        @SerializedName("logo")
        private String logo;
        @SerializedName("airlineName")
        private String airlineName;
        @SerializedName("airlineCode")
        private String airlineCode;
        @SerializedName("airlineCodeIata")
        private String airlineCodeIata;
        @SerializedName("tailNumber")
        private String tailNumber;
        @SerializedName("flightNumberInfo")
        private String flightNumberInfo;
        @SerializedName("flightNumberAlpha")
        private String flightNumberAlpha;
        @SerializedName("flightNumberNumeric")
        private String flightNumberNumeric;
        @SerializedName("departureAirportCode")
        private String departureAirportCode;
        @SerializedName("destinationAirportCode")
        private String destinationAirportCode;
        @SerializedName("departureAirportCodeIata")
        private String departureAirportCodeIata;
        @SerializedName("destinationAirportCodeIata")
        private String destinationAirportCodeIata;
        @SerializedName("departureAirportLatitude")
        private double departureAirportLatitude;
        @SerializedName("destinationAirportLatitude")
        private double destinationAirportLatitude;
        @SerializedName("departureAirportLongitude")
        private double departureAirportLongitude;
        @SerializedName("destinationAirportLongitude")
        private double destinationAirportLongitude;
        @SerializedName("origin")
        private String origin;
        @SerializedName("destination")
        private String destination;
        @SerializedName("departureCity")
        private String departureCity;
        @SerializedName("destinationCity")
        private String destinationCity;
        @SerializedName("expectedArrival")
        private String expectedArrival;
        @SerializedName("departureTime")
        private String departureTime;
        @SerializedName("abpVersion")
        private String abpVersion;
        @SerializedName("acpuVersion")
        private String acpuVersion;
        @SerializedName("videoService")
        private boolean videoService;
        @SerializedName("latitude")
        private double latitude;
        @SerializedName("longitude")
        private double longitude;
        @SerializedName("altitude")
        private double altitude;
        @SerializedName("localTime")
        private String localTime;
        @SerializedName("utcTime")
        private String utcTime;
        @SerializedName("destinationTimeZoneOffset")
        private int destinationTimeZoneOffset;
        @SerializedName("hspeed")
        private double hspeed;
        @SerializedName("vspeed")
        private double vspeed;

        // Add your constructors, getters, and setters here

        public FlightInfo() {
        }

        public FlightInfo(String logo, String airlineName, String airlineCode, String airlineCodeIata, String tailNumber, String flightNumberInfo, String flightNumberAlpha, String flightNumberNumeric, String departureAirportCode, String destinationAirportCode, String departureAirportCodeIata, String destinationAirportCodeIata, double departureAirportLatitude, double destinationAirportLatitude, double departureAirportLongitude, double destinationAirportLongitude, String origin, String destination, String departureCity, String destinationCity, String expectedArrival, String departureTime, String abpVersion, String acpuVersion, boolean videoService, double latitude, double longitude, double altitude, String localTime, String utcTime, int destinationTimeZoneOffset, double hspeed, double vspeed) {
            this.logo = logo;
            this.airlineName = airlineName;
            this.airlineCode = airlineCode;
            this.airlineCodeIata = airlineCodeIata;
            this.tailNumber = tailNumber;
            this.flightNumberInfo = flightNumberInfo;
            this.flightNumberAlpha = flightNumberAlpha;
            this.flightNumberNumeric = flightNumberNumeric;
            this.departureAirportCode = departureAirportCode;
            this.destinationAirportCode = destinationAirportCode;
            this.departureAirportCodeIata = departureAirportCodeIata;
            this.destinationAirportCodeIata = destinationAirportCodeIata;
            this.departureAirportLatitude = departureAirportLatitude;
            this.destinationAirportLatitude = destinationAirportLatitude;
            this.departureAirportLongitude = departureAirportLongitude;
            this.destinationAirportLongitude = destinationAirportLongitude;
            this.origin = origin;
            this.destination = destination;
            this.departureCity = departureCity;
            this.destinationCity = destinationCity;
            this.expectedArrival = expectedArrival;
            this.departureTime = departureTime;
            this.abpVersion = abpVersion;
            this.acpuVersion = acpuVersion;
            this.videoService = videoService;
            this.latitude = latitude;
            this.longitude = longitude;
            this.altitude = altitude;
            this.localTime = localTime;
            this.utcTime = utcTime;
            this.destinationTimeZoneOffset = destinationTimeZoneOffset;
            this.hspeed = hspeed;
            this.vspeed = vspeed;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getAirlineName() {
            return airlineName;
        }

        public void setAirlineName(String airlineName) {
            this.airlineName = airlineName;
        }

        public String getAirlineCode() {
            return airlineCode;
        }

        public void setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
        }

        public String getAirlineCodeIata() {
            return airlineCodeIata;
        }

        public void setAirlineCodeIata(String airlineCodeIata) {
            this.airlineCodeIata = airlineCodeIata;
        }

        public String getTailNumber() {
            return tailNumber;
        }

        public void setTailNumber(String tailNumber) {
            this.tailNumber = tailNumber;
        }

        public String getFlightNumberInfo() {
            return flightNumberInfo;
        }

        public void setFlightNumberInfo(String flightNumberInfo) {
            this.flightNumberInfo = flightNumberInfo;
        }

        public String getFlightNumberAlpha() {
            return flightNumberAlpha;
        }

        public void setFlightNumberAlpha(String flightNumberAlpha) {
            this.flightNumberAlpha = flightNumberAlpha;
        }

        public String getFlightNumberNumeric() {
            return flightNumberNumeric;
        }

        public void setFlightNumberNumeric(String flightNumberNumeric) {
            this.flightNumberNumeric = flightNumberNumeric;
        }

        public String getDepartureAirportCode() {
            return departureAirportCode;
        }

        public void setDepartureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
        }

        public String getDestinationAirportCode() {
            return destinationAirportCode;
        }

        public void setDestinationAirportCode(String destinationAirportCode) {
            this.destinationAirportCode = destinationAirportCode;
        }

        public String getDepartureAirportCodeIata() {
            return departureAirportCodeIata;
        }

        public void setDepartureAirportCodeIata(String departureAirportCodeIata) {
            this.departureAirportCodeIata = departureAirportCodeIata;
        }

        public String getDestinationAirportCodeIata() {
            return destinationAirportCodeIata;
        }

        public void setDestinationAirportCodeIata(String destinationAirportCodeIata) {
            this.destinationAirportCodeIata = destinationAirportCodeIata;
        }

        public double getDepartureAirportLatitude() {
            return departureAirportLatitude;
        }

        public void setDepartureAirportLatitude(double departureAirportLatitude) {
            this.departureAirportLatitude = departureAirportLatitude;
        }

        public double getDestinationAirportLatitude() {
            return destinationAirportLatitude;
        }

        public void setDestinationAirportLatitude(double destinationAirportLatitude) {
            this.destinationAirportLatitude = destinationAirportLatitude;
        }

        public double getDepartureAirportLongitude() {
            return departureAirportLongitude;
        }

        public void setDepartureAirportLongitude(double departureAirportLongitude) {
            this.departureAirportLongitude = departureAirportLongitude;
        }

        public double getDestinationAirportLongitude() {
            return destinationAirportLongitude;
        }

        public void setDestinationAirportLongitude(double destinationAirportLongitude) {
            this.destinationAirportLongitude = destinationAirportLongitude;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDepartureCity() {
            return departureCity;
        }

        public void setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
        }

        public String getDestinationCity() {
            return destinationCity;
        }

        public void setDestinationCity(String destinationCity) {
            this.destinationCity = destinationCity;
        }

        public String getExpectedArrival() {
            return expectedArrival;
        }

        public void setExpectedArrival(String expectedArrival) {
            this.expectedArrival = expectedArrival;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public String getAbpVersion() {
            return abpVersion;
        }

        public void setAbpVersion(String abpVersion) {
            this.abpVersion = abpVersion;
        }

        public String getAcpuVersion() {
            return acpuVersion;
        }

        public void setAcpuVersion(String acpuVersion) {
            this.acpuVersion = acpuVersion;
        }

        public boolean isVideoService() {
            return videoService;
        }

        public void setVideoService(boolean videoService) {
            this.videoService = videoService;
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

        public double getAltitude() {
            return altitude;
        }

        public void setAltitude(double altitude) {
            this.altitude = altitude;
        }

        public String getLocalTime() {
            return localTime;
        }

        public void setLocalTime(String localTime) {
            this.localTime = localTime;
        }

        public String getUtcTime() {
            return utcTime;
        }

        public void setUtcTime(String utcTime) {
            this.utcTime = utcTime;
        }

        public int getDestinationTimeZoneOffset() {
            return destinationTimeZoneOffset;
        }

        public void setDestinationTimeZoneOffset(int destinationTimeZoneOffset) {
            this.destinationTimeZoneOffset = destinationTimeZoneOffset;
        }

        public double getHspeed() {
            return hspeed;
        }

        public void setHspeed(double hspeed) {
            this.hspeed = hspeed;
        }

        public double getVspeed() {
            return vspeed;
        }

        public void setVspeed(double vspeed) {
            this.vspeed = vspeed;
        }
    }

    public static class ServiceInfo {
        @SerializedName("service")
        private String service;
        @SerializedName("remaining")
        private int remaining;
        @SerializedName("quality")
        private String quality;
        @SerializedName("productCode")
        private String productCode;
        @SerializedName("alerts")
        private String[] alerts;

        // Add your constructors, getters, and setters here

        public ServiceInfo() {
        }

        public ServiceInfo(String service, int remaining, String quality, String productCode, String[] alerts) {
            this.service = service;
            this.remaining = remaining;
            this.quality = quality;
            this.productCode = productCode;
            this.alerts = alerts;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public int getRemaining() {
            return remaining;
        }

        public void setRemaining(int remaining) {
            this.remaining = remaining;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String[] getAlerts() {
            return alerts;
        }

        public void setAlerts(String[] alerts) {
            this.alerts = alerts;
        }
    }

    public static class SystemInfo {
        @SerializedName("wapType")
        private String wapType;
        @SerializedName("systemType")
        private String systemType;
        @SerializedName("arincEnabled")
        private String arincEnabled;
        @SerializedName("horizontalVelocity")
        private String horizontalVelocity;
        @SerializedName("verticalVelocity")
        private String verticalVelocity;
        @SerializedName("aboveGndLevel")
        private String aboveGndLevel;
        @SerializedName("aboveSeaLevel")
        private String aboveSeaLevel;
        @SerializedName("flightPhase")
        private String flightPhase;
        @SerializedName("flightNo")
        private String flightNo;
        @SerializedName("timeToLand")
        private int timeToLand;
        @SerializedName("paxSsidStatus")
        private String paxSsidStatus;
        @SerializedName("casSsidStatus")
        private String casSsidStatus;
        @SerializedName("countryCode")
        private String countryCode;
        @SerializedName("airportCode")
        private String airportCode;
        @SerializedName("linkState")
        private String linkState;
        @SerializedName("linkType")
        private String linkType;
        @SerializedName("tunnelState")
        private String tunnelState;
        @SerializedName("tunnelType")
        private String tunnelType;
        @SerializedName("ifcPaxServiceState")
        private String ifcPaxServiceState;
        @SerializedName("ifcCasServiceState")
        private String ifcCasServiceState;
        @SerializedName("currentLinkStatusCode")
        private String currentLinkStatusCode;
        @SerializedName("currentLinkStatusDescription")
        private String currentLinkStatusDescription;
        @SerializedName("noSubscribedUsers")
        private String noSubscribedUsers;
        @SerializedName("aircraftType")
        private String aircraftType;

        // Add your constructors, getters, and setters here

        public SystemInfo() {
        }

        public SystemInfo(String wapType, String systemType, String arincEnabled, String horizontalVelocity, String verticalVelocity, String aboveGndLevel, String aboveSeaLevel, String flightPhase, String flightNo, int timeToLand, String paxSsidStatus, String casSsidStatus, String countryCode, String airportCode, String linkState, String linkType, String tunnelState, String tunnelType, String ifcPaxServiceState, String ifcCasServiceState, String currentLinkStatusCode, String currentLinkStatusDescription, String noSubscribedUsers, String aircraftType) {
            this.wapType = wapType;
            this.systemType = systemType;
            this.arincEnabled = arincEnabled;
            this.horizontalVelocity = horizontalVelocity;
            this.verticalVelocity = verticalVelocity;
            this.aboveGndLevel = aboveGndLevel;
            this.aboveSeaLevel = aboveSeaLevel;
            this.flightPhase = flightPhase;
            this.flightNo = flightNo;
            this.timeToLand = timeToLand;
            this.paxSsidStatus = paxSsidStatus;
            this.casSsidStatus = casSsidStatus;
            this.countryCode = countryCode;
            this.airportCode = airportCode;
            this.linkState = linkState;
            this.linkType = linkType;
            this.tunnelState = tunnelState;
            this.tunnelType = tunnelType;
            this.ifcPaxServiceState = ifcPaxServiceState;
            this.ifcCasServiceState = ifcCasServiceState;
            this.currentLinkStatusCode = currentLinkStatusCode;
            this.currentLinkStatusDescription = currentLinkStatusDescription;
            this.noSubscribedUsers = noSubscribedUsers;
            this.aircraftType = aircraftType;
        }

        public String getWapType() {
            return wapType;
        }

        public void setWapType(String wapType) {
            this.wapType = wapType;
        }

        public String getSystemType() {
            return systemType;
        }

        public void setSystemType(String systemType) {
            this.systemType = systemType;
        }

        public String getArincEnabled() {
            return arincEnabled;
        }

        public void setArincEnabled(String arincEnabled) {
            this.arincEnabled = arincEnabled;
        }

        public String getHorizontalVelocity() {
            return horizontalVelocity;
        }

        public void setHorizontalVelocity(String horizontalVelocity) {
            this.horizontalVelocity = horizontalVelocity;
        }

        public String getVerticalVelocity() {
            return verticalVelocity;
        }

        public void setVerticalVelocity(String verticalVelocity) {
            this.verticalVelocity = verticalVelocity;
        }

        public String getAboveGndLevel() {
            return aboveGndLevel;
        }

        public void setAboveGndLevel(String aboveGndLevel) {
            this.aboveGndLevel = aboveGndLevel;
        }

        public String getAboveSeaLevel() {
            return aboveSeaLevel;
        }

        public void setAboveSeaLevel(String aboveSeaLevel) {
            this.aboveSeaLevel = aboveSeaLevel;
        }

        public String getFlightPhase() {
            return flightPhase;
        }

        public void setFlightPhase(String flightPhase) {
            this.flightPhase = flightPhase;
        }

        public String getFlightNo() {
            return flightNo;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public int getTimeToLand() {
            return timeToLand;
        }

        public void setTimeToLand(int timeToLand) {
            this.timeToLand = timeToLand;
        }

        public String getPaxSsidStatus() {
            return paxSsidStatus;
        }

        public void setPaxSsidStatus(String paxSsidStatus) {
            this.paxSsidStatus = paxSsidStatus;
        }

        public String getCasSsidStatus() {
            return casSsidStatus;
        }

        public void setCasSsidStatus(String casSsidStatus) {
            this.casSsidStatus = casSsidStatus;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getAirportCode() {
            return airportCode;
        }

        public void setAirportCode(String airportCode) {
            this.airportCode = airportCode;
        }

        public String getLinkState() {
            return linkState;
        }

        public void setLinkState(String linkState) {
            this.linkState = linkState;
        }

        public String getLinkType() {
            return linkType;
        }

        public void setLinkType(String linkType) {
            this.linkType = linkType;
        }

        public String getTunnelState() {
            return tunnelState;
        }

        public void setTunnelState(String tunnelState) {
            this.tunnelState = tunnelState;
        }

        public String getTunnelType() {
            return tunnelType;
        }

        public void setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
        }

        public String getIfcPaxServiceState() {
            return ifcPaxServiceState;
        }

        public void setIfcPaxServiceState(String ifcPaxServiceState) {
            this.ifcPaxServiceState = ifcPaxServiceState;
        }

        public String getIfcCasServiceState() {
            return ifcCasServiceState;
        }

        public void setIfcCasServiceState(String ifcCasServiceState) {
            this.ifcCasServiceState = ifcCasServiceState;
        }

        public String getCurrentLinkStatusCode() {
            return currentLinkStatusCode;
        }

        public void setCurrentLinkStatusCode(String currentLinkStatusCode) {
            this.currentLinkStatusCode = currentLinkStatusCode;
        }

        public String getCurrentLinkStatusDescription() {
            return currentLinkStatusDescription;
        }

        public void setCurrentLinkStatusDescription(String currentLinkStatusDescription) {
            this.currentLinkStatusDescription = currentLinkStatusDescription;
        }

        public String getNoSubscribedUsers() {
            return noSubscribedUsers;
        }

        public void setNoSubscribedUsers(String noSubscribedUsers) {
            this.noSubscribedUsers = noSubscribedUsers;
        }

        public String getAircraftType() {
            return aircraftType;
        }

        public void setAircraftType(String aircraftType) {
            this.aircraftType = aircraftType;
        }
    }
}


