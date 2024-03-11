package com.enesppl.labamicroservices.service.impl;


import com.enesppl.labamicroservices.dto.OrderDto;
import com.enesppl.labamicroservices.dto.ProductDto;
import com.enesppl.labamicroservices.dto.OrderProductDto;
import com.enesppl.labamicroservices.repository.OrderProductRepository;
import com.enesppl.labamicroservices.service.OrderProductService;
import com.enesppl.labamicroservices.repository.OrderRepository;
import com.enesppl.labamicroservices.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProducServicetImpl implements OrderProductService {


    private OrderRepository orderRepository;
    private ProductRepository productRepository;
    private OrderProductRepository orderProductRepository;

    private ModelMapper modelMapper;


    @Override
    public OrderProductDto createOrderProduct(ProductDto productDto, OrderDto orderDto) {
/*
        Order order = AutoOrderMapper.MAPPER.maptToOrder(orderDto);
        Product product = AutoProductMapper.MAPPER.mapToProduct(productDto);
        List<OrderProductDto>

*/





return null;

    }

    @Override
    public OrderProductDto getOrderById(Long orderProductId) {
        return null;
    }

    @Override
    public List<OrderProductDto> getAllOrdersAndProducts() {
        return null;
    }

    @Override
    public OrderProductDto updateOrderProduct(OrderProductDto orderProductDto) {
        return null;
    }

    @Override
    public void deleteOrderProduct(Long orderProductId) {

    }
}
