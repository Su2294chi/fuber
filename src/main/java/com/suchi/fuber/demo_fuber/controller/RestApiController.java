package com.suchi.fuber.demo_fuber.controller;

import com.suchi.fuber.demo_fuber.model.dao.DaoImpl;
import com.suchi.fuber.demo_fuber.model.database.Database;
import com.suchi.fuber.demo_fuber.model.entity.Cab;
import com.suchi.fuber.demo_fuber.model.entity.Customer;
import com.suchi.fuber.demo_fuber.model.entity.Location;
import com.suchi.fuber.demo_fuber.model.entity.Trip;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApiController {

    private DaoImpl dao = new DaoImpl(Database.getInstance());

    @RequestMapping("/")
    @ResponseBody
    public List<Cab> getCabList() {
        return dao.getCabList();
    }

    @RequestMapping("/assignCabToUser")
    @ResponseBody
    public Cab assignCabToUser(
            @RequestParam(value = "startlat") String startLat,
            @RequestParam(value = "startlon") String startLon,
            @RequestParam(value = "endlat") String endLat,
            @RequestParam(value = "endlon") String endLon,
            @RequestParam(value = "pink") String isPink) {
        Trip trip = new Trip(new Location(Double.valueOf(startLat), Double.valueOf(startLon)), new Location(Double.valueOf(endLat), Double.valueOf(endLon)), Boolean.getBoolean(isPink));
        return dao.assignCabToUser(new Customer(trip));
    }

    @RequestMapping("/endTrip")
    @ResponseBody
    public String endTrip(@RequestParam(value = "tripid") int tripId) {
        return dao.endTrip(tripId);
    }

}
