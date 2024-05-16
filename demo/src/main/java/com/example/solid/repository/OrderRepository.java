package com.example.solid.repository;

import com.example.solid.dto.Order;

public interface OrderRepository {
    void updateOrderStatus(Order order, String status);
    boolean verifyOrderInventory(Order order);
}
