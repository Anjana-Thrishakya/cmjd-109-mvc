/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author anjana
 */
public class ItemDto {
    
    private String itemCode;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoh;
    
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }
    
    public String getItemCode(){
        return this.itemCode;
    }
    
}
