/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author anjan
 */
public class OrderDetailModel {
    public String saveOrderDetail(OrderDetailDto orderDetailDto) throws  Exception{
        String sql = "INSERT INTO Orderdetail VALUES(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, orderDetailDto.getOrderId());
        statement.setString(2, orderDetailDto.getItemCode());
        statement.setInt(3, orderDetailDto.getQty());
        statement.setDouble(4, orderDetailDto.getDiscount());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
}
