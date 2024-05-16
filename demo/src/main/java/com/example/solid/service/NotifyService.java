package com.example.solid.service;

import com.example.solid.dto.Order;

public interface NotifyService {
    void sendNotification(Order order);
}
