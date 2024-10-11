/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algoritmafinalodev1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yunus Emre
 */
public class dbHelper {
    
    
    
    private final String username = "root";
    private final String password = "12345";
    private final String dbUrl = "jdbc:mysql://localhost:3306/okul";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,username,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
    
}
