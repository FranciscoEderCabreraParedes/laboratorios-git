package com.example.solid.repository.impl;

import com.example.solid.dto.Order;
import com.example.solid.repository.OrderRepository;

public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public void updateOrderStatus(Order order, String status) {
        System.out.println("Orden: " + order.getId() + " actualizada: " + status);
    }

    @Override
    public boolean verifyOrderInventory(Order order) {
        Integer inventory = 100; 
        boolean verify = true;    

        if (inventory < order.getQuantity()) {
            verify = false;
        }

       return verify;
    }
    
}
