package com.enesppl.labamicroservicescourse.orederService;


import com.enesppl.labamicroservicescourse.dto.OrderDTO;
import com.enesppl.labamicroservicescourse.repository.OrderMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final JdbcTemplate jdbcTemplate;

    public OrderService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(){


}


public  List<OrderDTO> getOrderByCategory(){

   List<OrderDTO> query=  jdbcTemplate.query("select * from products t where order t , CATEGORY_NAME = ?",new Object[]{},new OrderMapper());

    return query;
}










}
