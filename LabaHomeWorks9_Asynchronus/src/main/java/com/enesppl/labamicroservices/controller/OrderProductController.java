package com.enesppl.labamicroservices.controller;

import com.enesppl.labamicroservices.dto.OrderProductDto;
import com.enesppl.labamicroservices.entity.Order;
import com.enesppl.labamicroservices.entity.User;
import com.enesppl.labamicroservices.service.OrderProductService;
import com.enesppl.labamicroservices.service.impl.OrderProducServicetImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-product")
public class OrderProductController {
    private static final Logger logger = LoggerFactory.getLogger(OrderProductController.class);

    private OrderProductService orderProductService;
    private Order order;
    private User user;

    public OrderProductController(OrderProductService orderProductService, Order order, User user) {
        this.orderProductService = orderProductService;
        this.order = order;
        this.user = user;
    }

    @PostMapping
    public ResponseEntity<OrderProductDto> createOrderProduct(@RequestBody OrderProductDto orderProductDto){
        OrderProductDto savedProduct = orderProductService.createOrderProduct(orderProductDto);
        logger.info("*******************Product Created*********************");

        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);

    }




}
