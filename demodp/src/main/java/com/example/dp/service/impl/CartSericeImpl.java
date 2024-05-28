package com.example.dp.service.impl;

import com.example.dp.enums.Distance;
import com.example.dp.service.VehiculeService;

public class CartSericeImpl implements VehiculeService {

    @Override
    public Integer move() {
        return Distance.CAR.getDistance();
    }
    
}
