package com.enesppl.springbootrestfulwebservices.mapper;

import com.enesppl.springbootrestfulwebservices.entity.Product;
import com.enesppl.springbootrestfulwebservices.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoProductMapper {

    AutoProductMapper MAPPER = Mappers.getMapper(AutoProductMapper.class);

    ProductDto maptToProductDto(Product product);

    Product mapToProduct(ProductDto productDto);
}
