package com.example.dp.factory;

import com.example.dp.service.VehiculeService;
import com.example.dp.service.impl.CartSericeImpl;
import com.example.dp.service.impl.MotoServiceImpl;
import com.example.dp.service.impl.PlaneServiceImpl;

public class VehiculeFactory {

    public static VehiculeService getVehiculeService(String type){
        switch (type) {
            case "MOTO":
                return new MotoServiceImpl();
            
            case "CART":
                return new CartSericeImpl();
        
            case "PLANE":
                return new PlaneServiceImpl();    
            
            default:
                throw new Error("Vehicule type not found");
        }
    } 
    
}
