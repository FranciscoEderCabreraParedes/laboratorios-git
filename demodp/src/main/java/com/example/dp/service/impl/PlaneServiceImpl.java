package com.example.dp.service.impl;

import com.example.dp.enums.Distance;
import com.example.dp.service.VehiculeService;

public class PlaneServiceImpl implements VehiculeService {

    @Override
    public Integer move() {
        return Distance.PLANE.getDistance();
    }
    
}
