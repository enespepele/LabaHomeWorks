package com.enesppl.labamicroservices.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Order {






    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;

    @Column
    private Date orderDate;
    @Column
    private String orderDescription;

    @Column
    private Double totalAmount;


 

public interface ShippingCostStrategy {
    double calculate(double weight);
}

public class StandardShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 1.25;
    }
}

public class ExpressShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 2.50;


}



}
}