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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rodrigo Nantes
 */
public class CidadeEstadoDAO {

    String stmtEstado = "SELECT * FROM estado";
    String stmtCidade = "SELECT * FROM cidade WHERE uf_coduf = ? ";
    
    public Map selectEstado(){
        Map<Integer,String> mapEstado = new HashMap<Integer,String>();
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtEstado);
            rs = stmt.executeQuery();
            while(rs.next()){
                mapEstado.put(rs.getInt("coduf"), rs.getString("siglauf"));
            }
            return mapEstado;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar estados. Origem = "+e.getMessage());
        }
        
    }

    public Map selectCidade(int estado){
        
        Map<Integer,String> mapCidade = new HashMap<Integer,String>();
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtCidade);
            stmt.setInt(1, estado);
            rs = stmt.executeQuery();
            while(rs.next()){
                mapCidade.put(rs.getInt("codcidade"), rs.getString("nomecidade"));
            }
            return mapCidade;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar estados. Origem = "+e.getMessage());
        }
        
    }
}
