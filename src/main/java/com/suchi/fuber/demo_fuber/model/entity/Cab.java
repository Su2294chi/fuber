package com.suchi.fuber.demo_fuber.model.entity;

public class Cab {
    private int id;

    private boolean isPinkCab;

    private Location location;

    private Trip trip;

    public Cab(int id, boolean isPinkCab) {
        this.id = id;
        this.isPinkCab = isPinkCab;
    }

    public int getId() {
        return id;
    }

    public boolean isPinkCab() {
        return isPinkCab;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
