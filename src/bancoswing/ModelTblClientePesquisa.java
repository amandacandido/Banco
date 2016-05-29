/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoswing;

import Classes.Cliente;
import dao.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo Nantes
 */
public class ModelTblClientePesquisa extends AbstractTableModel{

    private String[] colunas; 
    private Object[][] linhas;
    private List<Cliente> cliLista = new ArrayList<>();
    ClienteDAO cliDao = new ClienteDAO();
    
    public ModelTblClientePesquisa(String opt, String pesq) {
        cliLista = cliDao.selectCliente(opt, pesq);    
        updateTable();
        colunas = new String[]{"CPF","Nome","Sobrenome","Salário"};
    }
    
    public void reSelect(String opt, String pesq){
        cliLista = cliDao.selectCliente(opt, pesq);    
        updateTable();
        fireTableDataChanged();
    }
    
    public void updateTable(){
        linhas = new Object[cliLista.size()][4];
        int i = 0;
        for (Cliente x : cliLista){
            linhas[i][0] = x.getCPF();
            linhas[i][1] = x.getNome();
            linhas[i][2] = x.getSobreNome();
            linhas[i][3] = x.getSalario();
            i++;
        }
    }
    
    @Override
    public int getRowCount() {
        return linhas.length; 
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return linhas[rowIndex][columnIndex];
    }
    
    public void setListaCliente(List lista){
        this.cliLista = lista;
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int col) {
        return colunas[col];
    }
    
}
