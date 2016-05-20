/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Nantes
 */
public class ClienteDAO {
    
    private final String stmtSelectCliente = "SELECT * FROM Cliente WHERE ? LIKE ?+'%' ";

    
    // retorna arrays de clientes pesquisados por algum critério
    public ArrayList<Cliente> selectCliente(String opt, String dado){
        ArrayList<Cliente> listCliente = new ArrayList<>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(stmtSelectCliente,PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, opt);
            stmt.setString(2, dado);
            rs = stmt.executeQuery();
            while(rs.next()){
                
            }
        } catch(Exception e){
            
        }
        return listCliente;
    }
    
}
