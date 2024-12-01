/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

/**
 *
 * @author anjan
 */
public class DBConnection {
    private static DBConnection dBConnection;

    private DBConnection() {
    }
    
    public static DBConnection getInstance(){
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
}
