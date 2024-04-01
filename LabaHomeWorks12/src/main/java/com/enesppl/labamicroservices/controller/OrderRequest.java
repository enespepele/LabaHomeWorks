package com.enesppl.labamicroservices.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Getter
@Setter
@RequestMapping("api/orderrequest")
public class OrderRequest {
        private Long productId;
        private String description;


  }









