package com.nexstore.order_manager.controller;

import com.nexstore.order_manager.dto.request.OrderDTO;
import com.nexstore.order_manager.dto.response.OrderResponse;
import com.nexstore.order_manager.service.OrderService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/order")
public class OrderController {

    private OrderService orderService;

    @PostMapping
    public OrderResponse saveOrder(@RequestBody OrderDTO orderDTO){
        return orderService.saveOrder(orderDTO);
    }
    
    @GetMapping
    public List<OrderResponse> getAllOrders(){
    	return orderService.getAllOrders();
    }
    
    @DeleteMapping("/{orderId}")
    public String deleteOrderById(@PathVariable("orderId") Integer orderId) {
    	return orderService.deleteOrder(orderId);
    }
    
}
