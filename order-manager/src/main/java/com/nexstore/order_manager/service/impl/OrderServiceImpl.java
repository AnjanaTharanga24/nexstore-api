package com.nexstore.order_manager.service.impl;

import com.nexstore.order_manager.dto.request.OrderDTO;
import com.nexstore.order_manager.model.Orders;
import com.nexstore.order_manager.repository.OrderRepository;
import com.nexstore.order_manager.service.OrderService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private ModelMapper modelMapper;

    @Override
    public List<OrderDTO> getAllOrders() {
        List<Orders> ordersList = orderRepository.findAll();
        return modelMapper.map(ordersList, new TypeToken<List<OrderDTO>>() {}.getType());
    }

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        Orders orders = modelMapper.map(orderDTO, Orders.class);
        Orders savedOrder = orderRepository.save(orders);
        return modelMapper.map(savedOrder, OrderDTO.class);
    }

    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public String deleteOrder(Integer orderId) {
        return null;
    }

    @Override
    public OrderDTO getOrderById(Integer orderId) {
        return null;
    }
}
