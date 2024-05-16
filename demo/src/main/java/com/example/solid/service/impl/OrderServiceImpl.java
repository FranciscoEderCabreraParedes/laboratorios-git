package com.example.solid.service.impl;

import com.example.solid.dto.Order;
import com.example.solid.factory.PaymentFactory;
import com.example.solid.repository.OrderRepository;
import com.example.solid.repository.impl.OrderRepositoryImpl;
import com.example.solid.service.NotifyService;
import com.example.solid.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private NotifyService notifyService;

    @Override
    public void processOrder(Order order) {
        orderRepository = new OrderRepositoryImpl();
        notifyService = new NotifyServiceImpl();

        if(orderRepository.verifyOrderInventory(order)){
            PaymentFactory.getPaymentService(order.getType()).processPayment(order);
            orderRepository.updateOrderStatus(order, "success");
            notifyService.sendNotification(order);
        }

    }
    
}
