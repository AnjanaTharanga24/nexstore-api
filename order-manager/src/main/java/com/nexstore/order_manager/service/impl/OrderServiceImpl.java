package com.nexstore.order_manager.service.impl;

import com.nexstore.order_manager.dto.request.OrderDTO;
import com.nexstore.order_manager.dto.response.OrderResponse;
import com.nexstore.order_manager.model.Orders;
import com.nexstore.order_manager.repository.OrderRepository;
import com.nexstore.order_manager.service.OrderService;

import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private ModelMapper modelMapper;

    @Override
    public List<OrderResponse> getAllOrders() {
       List<Orders> foundOrders = orderRepository.findAll();
       
//       List<OrderResponse> responses = new ArrayList<>();
//       for(Orders order : foundOrders) {
//    	  OrderResponse response = OrderResponse.builder()
//    	   .id(order.getId())
//    	   .itemId(order.getItemId())
//    	   .amount(order.getAmount())
//    	   .orderDate(order.getOrderDate())
//    	   .build();
//    	   
//    	  responses.add(response);
//       }
//       
//       return responses;
       
       // can use model mapper for map foundOrders List to the List of OrdeResponse instead of above code
       return modelMapper.map(foundOrders, new TypeToken<List<OrderResponse>>(){}.getType());
    }

    @Override
    public OrderResponse saveOrder(OrderDTO orderDTO) {
//        Orders orders = new Orders();
//        orders.setItemId(orderDTO.getItemId());
//        orders.setAmount(orderDTO.getAmount());
//        orders.setOrderDate(orderDTO.getOrderDate());
//        orderRepository.save(orders);

        //can use above code like this using modelmapper
        Orders orders = modelMapper.map(orderDTO,Orders.class);
        orderRepository.save(orders);

//        return OrderResponse.builder()
//                .id(orders.getId())
//                .itemId(orders.getItemId())
//                .orderDate(orders.getOrderDate())
//                .amount(orders.getAmount())
//                .build();

        OrderResponse response = modelMapper.map(orders,OrderResponse.class);
        return response;
    }

    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO ,  Integer id) {
    	Optional<Orders> foundOrder = orderRepository.findById(id);
    	
    	Orders order = foundOrder.get();
    	
    	order.setItemId(orderDTO.getItemId());
    	order.setOrderDate(orderDTO.getOrderDate());
    	order.setAmount(orderDTO.getAmount());
    	
    	Orders savedOrder = orderRepository.save(order);
    	
        return null;
    }

    @Override
    public String deleteOrder(Integer orderId) {
    	orderRepository.deleteById(orderId);
        return "order deleted successfully";
    }

    @Override
    public OrderDTO getOrderById(Integer orderId) {
        return null;
    }
}
