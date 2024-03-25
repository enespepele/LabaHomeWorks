package com.enesppl.labamicroservices.mapper;


import com.enesppl.labamicroservices.entity.OrderProduct;
import com.enesppl.labamicroservices.dto.OrderProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoOrderProductMapper {


    AutoOrderProductMapper MAPPER = Mappers.getMapper(AutoOrderProductMapper.class);

    OrderProductDto maptToOrderProductDto(OrderProduct orderProduct);

    OrderProduct mapToOrderProduct(OrderProductDto orderProductDto);







}
