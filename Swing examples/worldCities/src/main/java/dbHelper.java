
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yunus Emre
 */
public class dbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/?user=root";
    
    public Connection getConnection() throws SQLException{
            return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage(SQLException e){
        System.out.println("Error : " + e.getMessage());
        System.out.println("Error Code : " + e.getErrorCode());
    }
}
