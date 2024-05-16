package com.example.solid;

import com.example.solid.dto.Order;
import com.example.solid.service.OrderService;
import com.example.solid.service.impl.OrderServiceImpl;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        Order order = new Order(); 

        System.out.println("Inicia proceso de pago");

        order.setId(100);
        order.setType("STANDAR");
        order.setAmount(1000d);
        order.setQuantity(50);
        order.setCustomerEmail("mail@mail.com");

        orderService.processOrder(order);

        order = new Order(); 
        order.setId(200);
        order.setType("EXPRESS");
        order.setAmount(2000d);
        order.setQuantity(20);
        order.setCustomerEmail("mail@mail.com");
        order.setPriority("highPriority");
        orderService.processOrder(order);

        System.out.println("Finaliza proceso de pago");
    }
}