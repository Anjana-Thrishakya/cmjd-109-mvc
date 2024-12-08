/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author anjan
 */
public class OrderModel {
    
    public String save(OrderDto orderDto) throws Exception{
        String sql = "INSERT INTO Orders VALUES(?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, orderDto.getId());
        statement.setString(2, orderDto.getDate());
        statement.setString(3, orderDto.getCustId());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
}
