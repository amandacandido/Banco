/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Classes.Cliente;
import java.awt.List;
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
    
    private final String stmtDeleteCliente = "DELETE * FROM cliente WHERE cpf = ? ";
    
    private final String stmtInsertCliente = "INSERT INTO cliente (nome, sobrenome, cpf, rg, rua, numero, "
            + "cidade_codcidade, uf_coduf, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    
    // retorna arrays de clientes pesquisados por algum critério
    public ArrayList selectCliente(String opt, String dado){
        ArrayList<Cliente> listCliente = new ArrayList<>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente;
        try{
            String stmtSelectCliente = "SELECT * FROM Cliente WHERE "+opt+" LIKE ? ";
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtSelectCliente);
            
            stmt.setString(1, "%"+dado+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                // Cliente(String nome, String sobreNome, String CPF, String RG, String rua, int numero, 
                // int cidade, int uf, double salario ) 
                cliente = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"), 
                        rs.getString("rg"), rs.getString("rua"), rs.getInt("numero"), rs.getInt("cidade_codcidade"),
                        rs.getInt("uf_coduf"), rs.getDouble("salario") );
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
    
    public void insertCliente(Cliente c){
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtInsertCliente);
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobreNome());
            stmt.setString(3, c.getCPF());
            stmt.setString(4, c.getRG());
            stmt.setString(5, c.getRua());
            stmt.setInt(6, c.getNumero());
            stmt.setInt(7, c.getCidade());
            stmt.setInt(8, c.getUF());
            stmt.setDouble(9, c.getSalario());
            
            stmt.execute();
            
        }catch(SQLException | ClassNotFoundException ex){
            throw new RuntimeException("Erro ao buscar cliente. Origem = "+ex.getMessage());
        }finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public void deleteCliente(Cliente c){
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtDeleteCliente);
            
            stmt.setString(1, c.getCPF());
            
            stmt.execute();
            
        }catch(SQLException | ClassNotFoundException ex){
            throw new RuntimeException("Erro ao excluir cliente. Origem = "+ex.getMessage());
        }finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
}
