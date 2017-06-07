package io.egen.controller;

import io.egen.entity.Vehicle;
import io.egen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */




@RestController
@RequestMapping(value = "vehicles")
public class VehicleController {

    @Autowired
    private VehicleService service;
   
    @RequestMapping(
            method = {RequestMethod.PUT})
    public void insertVehicle(@RequestBody Vehicle[] veh){

        System.out.println(""+veh);
          this.service.insertVehicle(veh);
    }



}
