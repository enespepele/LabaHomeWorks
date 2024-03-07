package com.enesppl.springbootrestfulwebservices.service;

import com.enesppl.springbootrestfulwebservices.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto product);

    ProductDto getProductById(Long productId);

    List<ProductDto> getAllProducts();

    ProductDto updateProducts(ProductDto productDto);

    void deleteProducts(Long productId);
}
