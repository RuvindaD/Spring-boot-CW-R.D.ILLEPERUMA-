package com.ijse.springbootcw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.springbootcw.entity.Order;

@Service
public interface OrderService {
    List<Order>getAllOrders();
    Order createOrder(Order order);
}
