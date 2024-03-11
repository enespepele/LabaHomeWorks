package com.enesppl.labamicroservices.repository;

import com.enesppl.labamicroservices.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
