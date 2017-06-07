package io.egen.repository;

import io.egen.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Sushma on 6/1/2017.
 */
@Repository
public class vehicleRepositoryImpl implements vehicleRespository {
    @PersistenceContext
    private EntityManager em;



    @Override
    public void insertOne(Vehicle vehi) {
        System.out.println(""+vehi);
        this.em.merge(vehi);
       
    }


}
