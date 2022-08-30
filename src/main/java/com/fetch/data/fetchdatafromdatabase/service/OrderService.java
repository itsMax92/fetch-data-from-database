package com.fetch.data.fetchdatafromdatabase.service;


import com.fetch.data.fetchdatafromdatabase.model.Order;
import com.fetch.data.fetchdatafromdatabase.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrderList() {
        return orderRepository.findAll();
    }
}
