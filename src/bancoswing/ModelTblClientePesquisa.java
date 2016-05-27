/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoswing;

import Classes.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo Nantes
 */
public class ModelTblClientePesquisa extends AbstractTableModel{

    private String[] colunas = new String[]{"CPF","Nome","Sobrenome","Salário"};
    private List<Cliente> cliLista = new ArrayList();
    
    public ModelTblClientePesquisa(){
        
    }
    
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setListaCliente(List lista){
        this.cliLista = lista;
        this.fireTableDataChanged();
    }
    
}
