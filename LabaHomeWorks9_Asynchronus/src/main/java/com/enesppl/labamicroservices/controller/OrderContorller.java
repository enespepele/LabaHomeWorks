package com.enesppl.labamicroservices.controller;


import com.enesppl.labamicroservices.dto.OrderDto;
import com.enesppl.labamicroservices.dto.ProductDto;
import com.enesppl.labamicroservices.entity.Order;
import com.enesppl.labamicroservices.service.OrderService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderContorller {

    private static final Logger logger = LoggerFactory.getLogger(OrderContorller.class);

    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto order){

        OrderDto savedOrder = orderService.createOrder(order);

        logger.info("*****************Order has taken ***************** ");

        return  new ResponseEntity<>(savedOrder, HttpStatus.OK);

    }

    // http://localhost:9090/api/orders/1
    @GetMapping("{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable("id") Long orderId){
        OrderDto order = orderService.getOrdertById(orderId);
        logger.info("Order is showed");
        return new ResponseEntity<>(order , HttpStatus.OK);


    }

    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrders(){
        List<OrderDto> orders = orderService.getAllOrders();
        logger.info("***************Products are showed****************");
        return new ResponseEntity<>(orders , HttpStatus.OK);
    }












}
