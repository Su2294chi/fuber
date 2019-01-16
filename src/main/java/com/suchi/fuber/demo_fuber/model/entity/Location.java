package com.suchi.fuber.demo_fuber.model.entity;

public class Location {
    private double latitude;

    private double longitude;

    public Location() {
        this.latitude = getRandomCoordinate();
        this.longitude = getRandomCoordinate();
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private double getRandomCoordinate() {
        return Math.random()*360 - 180;
    }
}
