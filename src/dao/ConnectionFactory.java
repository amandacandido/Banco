/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rodrigo Nantes
 */
public class ConnectionFactory {
      
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
            String url = "jdbc:mysql://localhost:3306/databasebanco";  
            String usuario = "root";  
            String senha = "";
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            return con;
    }
    
}
