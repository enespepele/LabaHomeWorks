package com.enesppl.labamicroservicescourse.repository;

import com.enesppl.labamicroservicescourse.dto.OrderDTO;
import org.aspectj.weaver.ast.Or;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<OrderDTO> {


    @Override
    public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCategory(rs.getString("CATEGORY"));
        orderDTO.setDescription(rs.getString("DESCRIPTION"));
        orderDTO.setName(rs.getString("NAME"));
        orderDTO.setPrice(rs.getDouble("PRICE"));
        orderDTO.setPhotoUrl(rs.getString("PHOTO_URL"));

        return orderDTO;

    }
}
