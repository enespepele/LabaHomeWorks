package com.enesppl.labamicroservices.service;

import com.enesppl.labamicroservices.dto.OrderDto;
import com.enesppl.labamicroservices.dto.OrderProductDto;
import com.enesppl.labamicroservices.dto.ProductDto;

import java.util.List;

public interface OrderProductService {

    OrderProductDto createOrderProduct(ProductDto productDto, OrderDto orderDto);


    OrderProductDto getOrderById(Long orderProductId);

    List<OrderProductDto> getAllOrdersAndProducts();

    OrderProductDto updateOrderProduct(OrderProductDto orderProductDto);



    void deleteOrderProduct(Long orderProductId);








}
