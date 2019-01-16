package com.suchi.fuber.demo_fuber.model.dao;

import com.suchi.fuber.demo_fuber.model.entity.Cab;
import com.suchi.fuber.demo_fuber.model.entity.Customer;

import java.util.List;

public interface Dao {

    List<Cab> getCabList();

    Cab assignCabToUser(Customer customer);

    String endTrip(int tripId);

}