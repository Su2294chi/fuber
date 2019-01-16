package com.suchi.fuber.demo_fuber.utils;

import com.suchi.fuber.demo_fuber.model.entity.Location;

public class Utils {

    public static int TRIP_ID = 0;

    public static double distance(Location l1, Location l2) {
        return Math.sqrt((l1.getLatitude() - l2.getLatitude()) * (l1.getLatitude() - l2.getLatitude()) + (l1.getLongitude() - l2.getLongitude()) * (l1.getLongitude() - l2.getLongitude()));
    }

}
