package com.nexstore.order_manager.service;

import com.nexstore.order_manager.dto.request.OrderDTO;
import com.nexstore.order_manager.dto.response.OrderResponse;
import org.hibernate.query.Order;

import java.util.List;

public interface OrderService {

    List<OrderResponse> getAllOrders();
    OrderResponse saveOrder(OrderDTO orderDTO);
    OrderResponse updateOrder(OrderDTO orderDTO , Integer id);
    String deleteOrder(Integer orderId);
    OrderResponse getOrderById(Integer orderId);
}
