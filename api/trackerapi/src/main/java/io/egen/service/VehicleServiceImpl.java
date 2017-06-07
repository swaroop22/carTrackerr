package io.egen.service;

import io.egen.entity.Vehicle;
import io.egen.exception.BadRequestException;
import io.egen.exception.NotFoundException;
import java.util.List;

import io.egen.repository.vehicleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * Created by Sushma on 6/1/2017.
 */
@Service
public class VehicleServiceImpl implements VehicleService {
//
    @Autowired
    private vehicleRespository repository;



    public VehicleServiceImpl() {
    }

    @Transactional
    @Override
    public void insertVehicle(Vehicle[] veh) {
    

        if (veh == null) {
            
        }

        for (Vehicle vehicle : veh) {

            this.repository.insertOne(vehicle);
        }
        
    }
}








