package com.suchi.fuber.demo_fuber.model.repository;

import com.suchi.fuber.demo_fuber.model.entity.Cab;
import com.suchi.fuber.demo_fuber.model.entity.Location;

import java.util.ArrayList;
import java.util.List;

public class CabRepository {

    private List<Cab> cabList;

    public CabRepository() {
        this.cabList = initializeCabs();
    }

    public List<Cab> getCabList() {
        return cabList;
    }

    private List<Cab> initializeCabs() {

        cabList = new ArrayList<>();

        Cab c1 = new Cab(1, false);
        c1.setTrip(null);
        c1.setLocation(new Location());
        cabList.add(c1);

        Cab c2 = new Cab(2, true);
        c2.setTrip(null);
        c2.setLocation(new Location());
        cabList.add(c2);

        Cab c3 = new Cab(3, true);
        c3.setTrip(null);
        c3.setLocation(new Location());
        cabList.add(c3);

        Cab c4 = new Cab(4, false);
        c4.setTrip(null);
        c4.setLocation(new Location());
        cabList.add(c4);

        Cab c5 = new Cab(5, true);
        c5.setTrip(null);
        c5.setLocation(new Location());
        cabList.add(c5);

        Cab c6 = new Cab(6, false);
        c6.setTrip(null);
        c6.setLocation(new Location());
        cabList.add(c6);

        return cabList;

    }

}
