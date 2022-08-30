package com.fetch.data.fetchdatafromdatabase.controller;


import com.fetch.data.fetchdatafromdatabase.model.Order;
import com.fetch.data.fetchdatafromdatabase.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "getAllOrders")
    public List<Order> getAllOrder() {
        return orderService.getAllOrderList();
    }
}
