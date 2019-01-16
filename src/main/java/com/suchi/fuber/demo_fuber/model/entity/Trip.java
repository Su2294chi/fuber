package com.suchi.fuber.demo_fuber.model.entity;

import com.suchi.fuber.demo_fuber.utils.Utils;

public class Trip {
    private int tripId;

    private Location startLocation;

    private Location destinationLocation;

    private boolean isPinkCabRequired;

    public Trip(Location startLocation, Location destinationLocation, boolean isPinkCabRequired) {
        this.tripId = Utils.TRIP_ID++;
        this.startLocation = startLocation;
        this.destinationLocation = destinationLocation;
        this.isPinkCabRequired = isPinkCabRequired;
    }

    public int getTripId() {
        return tripId;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    public boolean isPinkCabRequired() {
        return isPinkCabRequired;
    }
}
