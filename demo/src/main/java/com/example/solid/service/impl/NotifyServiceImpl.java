package com.example.solid.service.impl;

import com.example.solid.dto.Order;
import com.example.solid.service.NotifyService;

public class NotifyServiceImpl implements NotifyService {

    @Override
    public void sendNotification(Order order) {
        System.out.println(order.getCustomerEmail() + " Your order has been processed");
    }
    
}
