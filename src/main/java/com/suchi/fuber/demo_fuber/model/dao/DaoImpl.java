package com.suchi.fuber.demo_fuber.model.dao;

import com.suchi.fuber.demo_fuber.model.database.Database;
import com.suchi.fuber.demo_fuber.model.entity.Cab;
import com.suchi.fuber.demo_fuber.model.entity.Customer;
import com.suchi.fuber.demo_fuber.model.entity.Location;
import com.suchi.fuber.demo_fuber.utils.Utils;
import com.suchi.fuber.demo_fuber.view.Output;

import java.util.List;

public class DaoImpl implements Dao {

    private Database database;

    public DaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public List<Cab> getCabList() {
        return database.getCabList();
    }

    @Override
    public Cab assignCabToUser(Customer customer) {

        Cab nearestCab = getNearestCabToUser(customer);

        if(nearestCab != null)
            nearestCab.setTrip(customer.getTrip());

        Output.printListOfCabs(getCabList());
        return null;
    }

    private Cab getNearestCabToUser(Customer customer) {
        Location l1 = customer.getTrip().getStartLocation();
        boolean isPinkCabNeeded = customer.getTrip().isPinkCabRequired();

        double minDistance = Double.MAX_VALUE;
        Cab nearestCab = null;

        for (Cab cab : getCabList()) {
            double d = Utils.distance(l1, cab.getLocation());
            if(cab.getTrip() == null && d < minDistance) {
                if(isPinkCabNeeded) {
                    if(cab.isPinkCab()) {
                        minDistance = d;
                        nearestCab = cab;
                    }
                }else {
                    minDistance = d;
                    nearestCab = cab;
                }
            }
        }

        return nearestCab;
    }

    @Override
    public String endTrip(int tripId) {
        String msg = "No trip found with given id";

        for (Cab cab : getCabList()) {
            if(cab.getTrip() != null && cab.getTrip().getTripId() == tripId) {
                cab.setLocation(cab.getTrip().getDestinationLocation());
                cab.setTrip(null);
                msg = "Trip deleted successfully";
            }
        }
        return msg;
    }

}
