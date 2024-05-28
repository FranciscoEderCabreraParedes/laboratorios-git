package com.example.dp.observer;

import com.example.dp.service.VehiculeService;

public interface VehiculeObserve {

    void addOserver(VehiculeService vehicule);
    void notifyObserver();
    
}
