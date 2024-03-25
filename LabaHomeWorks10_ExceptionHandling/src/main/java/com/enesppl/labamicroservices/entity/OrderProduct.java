package com.enesppl.labamicroservices.entity;


import com.enesppl.labamicroservices.entity.Order;
import com.enesppl.labamicroservices.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderProduct {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column
    private Order order;

    @Column
    private Product product;



    @Column
    private String orderProductDescription;















}
