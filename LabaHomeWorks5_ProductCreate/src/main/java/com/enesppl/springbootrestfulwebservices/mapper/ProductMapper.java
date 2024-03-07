package com.enesppl.springbootrestfulwebservices.mapper;

import com.enesppl.springbootrestfulwebservices.dto.ProductDto;
import com.enesppl.springbootrestfulwebservices.entity.Product;

public class ProductMapper {

    // Convert User JPA Entity into UserDto
    public static ProductDto mapToProductDto(Product product){
        ProductDto productDto = new ProductDto(
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getPhotoUrl(),
                product.getDescription(),
                product.getPrice()
        );
        return productDto;
    }

    // Convert ProductDto into Product JPA Entity
    public static Product mapToProduct(ProductDto productDto){
        Product product = new Product(
                productDto.getId(),
                productDto.getName(),
                productDto.getCategory(),
                productDto.getPhotoUrl(),
                productDto.getDescription(),
                productDto.getPrice()
        );
        return product;
    }
}
