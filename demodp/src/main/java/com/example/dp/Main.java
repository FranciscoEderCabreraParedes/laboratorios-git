package com.example.dp;

import com.example.dp.factory.VehiculeFactory;
import com.example.dp.observer.VehiculeObserverImpl;

public class Main {
    public static void main(String[] args) {
        //Registramos observers
        VehiculeObserverImpl observers = new VehiculeObserverImpl();
        observers.addOserver(VehiculeFactory.getVehiculeService("MOTO"));
        observers.addOserver(VehiculeFactory.getVehiculeService("CART"));
        observers.addOserver(VehiculeFactory.getVehiculeService("PLANE"));    

        observers.notifyObserver();
    }
}