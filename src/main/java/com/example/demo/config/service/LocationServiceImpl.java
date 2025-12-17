package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

public class LocationServiceImpl implements LocationService{
    @Autowired
    LocationRepository locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return locationrepo.save(le);
    }
    @Override
    public List<LocationEntity> getalllocation(){
        return locationrepo.findAll();
    }
}
