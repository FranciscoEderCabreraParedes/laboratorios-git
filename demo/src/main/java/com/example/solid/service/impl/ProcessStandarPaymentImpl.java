package com.example.solid.service.impl;

import com.example.solid.dto.Order;
import com.example.solid.http.ProcessPayment;
import com.example.solid.service.PaymentService;

public class ProcessStandarPaymentImpl implements PaymentService{

    @Override
    public boolean processPayment(Order order) {

        //Simulamos llamada a servicio de pago
        if (ProcessPayment.paymentService(order.getAmount())) {
            System.out.println("processPayment STANDAR");
            return true;
        } else {
            throw new Error("Payment failed");
        }
    }
    
}
