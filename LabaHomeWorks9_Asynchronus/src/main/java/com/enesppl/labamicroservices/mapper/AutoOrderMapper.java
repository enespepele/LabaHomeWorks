package com.enesppl.labamicroservices.mapper;

import com.enesppl.labamicroservices.dto.OrderDto;
import com.enesppl.labamicroservices.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoOrderMapper {



    AutoOrderMapper MAPPER = Mappers.getMapper(AutoOrderMapper.class);


    OrderDto maptToOrderDto(Order order);

    Order maptToOrder(OrderDto orderDto);





}
