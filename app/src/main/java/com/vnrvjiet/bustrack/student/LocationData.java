package com.vnrvjiet.bustrack.student;

import com.google.android.gms.maps.model.LatLng;

public class LocationData {
    String route;
    Double latitude;
    Double longitude;

    public LocationData(String route, Double latitude, Double longitude) {
        this.route = route;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationData(String route, LatLng latLng) {
        this.route = route;
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
