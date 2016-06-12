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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rodrigo Nantes
 */
public class CidadeEstadoDAO {

    String stmtEstado = "SELECT * FROM uf";
    String stmtCidade = "SELECT * FROM cidade WHERE uf_coduf = ? ";
    String stmtEstadoFromCidade = "SELECT siglauf FROM uf WHERE coduf = (SELECT uf_coduf FROM cidade WHERE codcidade = ? ) ";

    public Map selectEstado(){
        Map<String,Integer> mapEstado = new HashMap<String,Integer>();
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtEstado);
            rs = stmt.executeQuery();
            while(rs.next()){
                mapEstado.put(rs.getString("siglauf"),rs.getInt("coduf"));
            }
            return mapEstado;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar estados. Origem = "+e.getMessage());
        }
        
    }

    public Map selectCidade(int estado){
        
        Map<String,Integer> mapCidade = new HashMap<String,Integer>();
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtCidade);
            stmt.setInt(1, estado);
            rs = stmt.executeQuery();
            while(rs.next()){
                mapCidade.put(rs.getString("nomecidade"), rs.getInt("codcidade"));
            }
            return mapCidade;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar estados. Origem = "+e.getMessage());
        }
        
    }
    
    public String selectEstadoFromCidade(int codcidade) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String coduf = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtEstadoFromCidade);
            stmt.setInt(1, codcidade);
            rs = stmt.executeQuery();
            while(rs.next()){
                coduf = rs.getString("siglauf");
            }
            con.close();
            return coduf;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar estados. Origem = "+e.getMessage());
        }
    }
}
