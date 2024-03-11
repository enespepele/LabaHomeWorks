package com.enesppl.labamicroservices.mapper;

import com.enesppl.labamicroservices.entity.Product;
import com.enesppl.labamicroservices.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoProductMapper {

    AutoProductMapper MAPPER = Mappers.getMapper(AutoProductMapper.class);

    ProductDto maptToProductDto(Product product);

    Product mapToProduct(ProductDto productDto);
}
