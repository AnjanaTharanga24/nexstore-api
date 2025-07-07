package com.nexstore.order_manager.service;

import com.nexstore.order_manager.dto.request.OrderDTO;
import com.nexstore.order_manager.dto.response.OrderResponse;
import org.hibernate.query.Order;

import java.util.List;

public interface OrderService {

    List<OrderResponse> getAllOrders();
    OrderResponse saveOrder(OrderDTO orderDTO);
    OrderDTO updateOrder(OrderDTO orderDTO);
    String deleteOrder(Integer orderId);
    OrderDTO getOrderById(Integer orderId);
}
