package com.suchi.fuber.demo_fuber.view;

import com.suchi.fuber.demo_fuber.model.entity.Cab;

import java.util.List;

public class Output {

    public static void printListOfCabs(List<Cab> cabs) {
        System.out.println("Id" + "\t" + "IsPink" + "\t" + "Latitude" + "\t\t\t" + "Longitude" + "\t\t\t" + "Assigned To");
        for (Cab cab : cabs) {
            System.out.println(cab.getId() + "\t" +
                    cab.isPinkCab() + "\t" +
                    cab.getLocation().getLatitude() + "\t" +
                    cab.getLocation().getLongitude() + "\t" +
                    cab.getTrip().getTripId());
        }
    }

}
