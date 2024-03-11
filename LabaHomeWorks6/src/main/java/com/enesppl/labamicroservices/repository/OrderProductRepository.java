package com.enesppl.labamicroservices.repository;

import com.enesppl.labamicroservices.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {
}
