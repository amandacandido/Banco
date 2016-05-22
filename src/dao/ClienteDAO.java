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
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Nantes
 */
public class ClienteDAO {
    
    private final String stmtSelectCliente = "SELECT * FROM Cliente WHERE ? LIKE ?+'%' ";
    private final String stmtInsertCliente = "INSERT INTO Cliente (nome, sobrenome, cpf, rg, rua, numero, "
            + "cidade_codcidade, uf_coduf, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    
    // retorna arrays de clientes pesquisados por algum critério
    public ArrayList<Cliente> selectCliente(String opt, String dado){
        ArrayList<Cliente> listCliente = new ArrayList<>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente;
        try{
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(stmtSelectCliente,PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, opt);
            stmt.setString(2, dado);
            rs = stmt.executeQuery();
            while(rs.next()){
                // Cliente(String nome, String sobreNome, String CPF, String RG, String rua, int numero, 
                // int cidade, int uf, double salario ) 
                cliente = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"), 
                        rs.getString("rg"), rs.getString("rua"), rs.getInt("numero"), rs.getInt("cidade_codcidade"),
                        rs.getInt("uf"), rs.getDouble("salario") );
                listCliente.add(cliente);
            }
        }catch(SQLException | ClassNotFoundException ex){
            throw new RuntimeException("Erro ao buscar cliente. Origem = "+ex.getMessage());
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
        return listCliente;
    }
    
}
