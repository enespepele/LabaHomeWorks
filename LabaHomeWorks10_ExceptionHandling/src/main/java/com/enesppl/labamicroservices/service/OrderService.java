package com.enesppl.labamicroservices.service;

import com.enesppl.labamicroservices.dto.OrderDto;


import java.util.List;

public interface OrderService {



    OrderDto createOrder(OrderDto orderDto);

    OrderDto getOrdertById(Long orderId);

    List<OrderDto> getAllOrders();

    OrderDto updateOrder(OrderDto orderDto);

    void deleteOrders(Long orderId);



}
