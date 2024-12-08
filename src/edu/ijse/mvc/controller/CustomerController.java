/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;

/**
 *
 * @author anjan
 */
public class CustomerController {
    
    private CustomerModel customerModel = new CustomerModel();
    
    public CustomerDto searchCustomer(String id) throws Exception{
        return customerModel.searchCustomer(id);
    }
}
