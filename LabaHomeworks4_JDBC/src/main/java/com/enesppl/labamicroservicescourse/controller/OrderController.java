package com.enesppl.labamicroservicescourse.controller;


import com.enesppl.labamicroservicescourse.orederService.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/saveOrder")
    public void saveOrder(){
        orderService.save();
        System.out.println("Just try the PostMapping");
    }


    @GetMapping("/getOrderByCategory")
    public void getOrderByCategory(){
        System.out.println("In getOrderByCategory");
        orderService.getOrderByCategory();
        System.out.println("In the GetMapping /getOrderByCategory");
    }




}
