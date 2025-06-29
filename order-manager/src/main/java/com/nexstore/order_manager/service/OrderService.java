package com.nexstore.order_manager.service;

import com.nexstore.order_manager.dto.request.OrderDTO;
import org.hibernate.query.Order;

import java.util.List;

public interface OrderService {

    List<OrderDTO> getAllOrders();
    OrderDTO saveOrder(OrderDTO orderDTO);
    OrderDTO updateOrder(OrderDTO orderDTO);
    String deleteOrder(Integer orderId);
    OrderDTO getOrderById(Integer orderId);
}
