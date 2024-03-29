package com.enesppl.labamicroservices.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {


    private Long orderNumber;
    private Date orderDate;
    private String orderDescription;
    private Double totalAmount;




}
