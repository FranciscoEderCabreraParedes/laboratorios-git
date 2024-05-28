package com.example.dp.observer;

import java.util.ArrayList;
import java.util.List;

import com.example.dp.service.VehiculeService;

public class VehiculeObserverImpl implements VehiculeObserve {

    private static List<VehiculeService> observers = new ArrayList<>();

    @Override
    public void addOserver(VehiculeService vehicule) {
        observers.add(vehicule);
    }

    @Override
    public void notifyObserver() {
        for(VehiculeService observer: observers){
            observer.move();
        }
    }
    
}
