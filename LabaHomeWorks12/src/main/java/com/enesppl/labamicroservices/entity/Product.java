package com.enesppl.labamicroservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column()
    private String photoUrl;
    @Column()
    private String description;
    @Column()
    private Double price;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Order order;






}
