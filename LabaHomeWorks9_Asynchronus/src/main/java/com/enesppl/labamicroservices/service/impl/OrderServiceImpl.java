package com.enesppl.labamicroservices.service.impl;

import com.enesppl.labamicroservices.dto.OrderDto;
import com.enesppl.labamicroservices.entity.Order;
import com.enesppl.labamicroservices.entity.Product;
import com.enesppl.labamicroservices.entity.User;
import com.enesppl.labamicroservices.mapper.AutoOrderMapper;
import com.enesppl.labamicroservices.mapper.AutoProductMapper;
import com.enesppl.labamicroservices.repository.OrderRepository;
import com.enesppl.labamicroservices.service.OrderService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private ModelMapper modelMapper;


    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = AutoOrderMapper.MAPPER.maptToOrder(orderDto);
        Order savedOrder = orderRepository.save(order);
        OrderDto savedOrderDto = AutoOrderMapper.MAPPER.maptToOrderDto(savedOrder);
        return savedOrderDto;

    }

    @Override
    public OrderDto getOrdertById(Long orderId) {

        Optional<Order> optionalOrder = orderRepository.findById(orderId);

        Order order = optionalOrder.get();
        return AutoOrderMapper.MAPPER.maptToOrderDto(optionalOrder.get());





    }

    @Override
    public List<OrderDto> getAllOrders() {

        List<Order> orders = orderRepository.findAll();
        return orders.stream().map((order) -> AutoOrderMapper.MAPPER.maptToOrderDto(order)).collect(Collectors.toList());

    }

    @Override
    public OrderDto updateOrder(OrderDto orderDto) {
        Order existingOrder = orderRepository.findById(orderDto.getOrderNumber()).get();
        existingOrder.setOrderDate(orderDto.getOrderDate());
        existingOrder.setOrderNumber(orderDto.getOrderNumber());
        existingOrder.setOrderDescription(orderDto.getOrderDescription());
        existingOrder.setTotalAmount(orderDto.getTotalAmount());
        Order updatedOrder = orderRepository.save(existingOrder);
        return AutoOrderMapper.MAPPER.maptToOrderDto(updatedOrder);


    }

    @Override
    public void deleteOrders(Long orderId) {
        orderRepository.deleteById(orderId);

    }

    @Async
    public void sendSMSToUser(Order order, User user) {
    long orderNumber=order.getOrderNumber();
    String name = user.getName();
    long phoneNumber = user.getPhoneNumber();

    String smsBody= name +","+orderNumber+ "numaralı  siparşini aldık" ;

    try {
        Thread.sleep(2000);

    }
catch (InterruptedException e)
{
    throw new RuntimeException(e);
}




    }
}
