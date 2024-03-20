package com.enesppl.labamicroservices.service;

import com.enesppl.labamicroservices.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto product);

    ProductDto getProductById(Long productId);

    List<ProductDto> getAllProducts();

    ProductDto updateProducts(ProductDto productDto);

    void deleteProducts(Long productId);
}
