package com.example.solid.factory;

import com.example.solid.service.PaymentService;
import com.example.solid.service.impl.ProcessExpressPaymentImpl;
import com.example.solid.service.impl.ProcessStandarPaymentImpl;

public class PaymentFactory {

    public static PaymentService getPaymentService(String orderType){
        switch (orderType) {
            case "STANDAR":
                return new ProcessStandarPaymentImpl();

            case "EXPRESS":
                return new ProcessExpressPaymentImpl(); 
        
            default:
                throw new Error("Payment method not found");
        }
    }
    
}
