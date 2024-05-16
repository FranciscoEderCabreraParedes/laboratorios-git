package com.example.solid.service;

import com.example.solid.dto.Order;

public interface PaymentService  {
    boolean processPayment(Order order);
}
