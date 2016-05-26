/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoswing;

import Classes.Cliente;
import dao.ClienteDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lemke
 */
public class ClientePesquisa extends javax.swing.JFrame {

    String tela_anterior;
    ArrayList<Cliente> cliList;

    /**
     * Creates new form ClientePesquisa
     */
    public ClientePesquisa(String tela_anterior) {
        initComponents();
        this.tela_anterior = tela_anterior;
        optNome.setSelected(true);
        ClienteDAO dao = new ClienteDAO();
        cliList = dao.selectCliente("cpr","");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optNome = new javax.swing.JRadioButton();
        optSNome = new javax.swing.JRadioButton();
        optRg = new javax.swing.JRadioButton();
        optCPF = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        btClienteBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btClienteCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pesquisa de Cliente");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));

        optNome.setText("Nome");
        optNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optNomeActionPerformed(evt);
            }
        });

        optSNome.setText("Sobre Nome");
        optSNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSNomeActionPerformed(evt);
            }
        });

        optRg.setText("RG");
        optRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optRgActionPerformed(evt);
            }
        });

        optCPF.setText("CPF");
        optCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCPFActionPerformed(evt);
            }
        });

        btClienteBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_search_black_18dp_1x.png"))); // NOI18N
        btClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteBuscarActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TESTE", "Nome", "Sobrenome", "0.00"},
                {null, "nome2", "sobrenome2", "1.11"}
            },
            new String [] {
                "CPF", "Nome", "Sobrenome", "Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btClienteCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_arrow_back_black_18dp_1x.png"))); // NOI18N
        btClienteCancelar.setText("Voltar");
        btClienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optSNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optCPF)
                                .addGap(18, 18, 18)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optNome)
                    .addComponent(optSNome)
                    .addComponent(optRg)
                    .addComponent(optCPF)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteCancelar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //radio snome    
    private void optSNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSNomeActionPerformed
        optNome.setSelected(false);
        optRg.setSelected(false);
        optCPF.setSelected(false);
    }//GEN-LAST:event_optSNomeActionPerformed
    // radio rg
    private void optRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optRgActionPerformed
        optNome.setSelected(false);
        optSNome.setSelected(false);
        optCPF.setSelected(false);
    }//GEN-LAST:event_optRgActionPerformed
    // radio cpf
    private void optCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCPFActionPerformed
        optNome.setSelected(false);
        optSNome.setSelected(false);
        optRg.setSelected(false);
    }//GEN-LAST:event_optCPFActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            this.setVisible(false);
            if (tela_anterior.equals(new ContaCadastro().getTitle())) {
                new ContaCadastro().setVisible(true);
            } else if (tela_anterior.equals(new ClienteCadastro().getTitle())) {
                new ClienteCadastro().setVisible(true);
            } else if (tela_anterior.equals(new ContaGerenciar().getTitle())) {
                new ContaGerenciar().setVisible(true);
            } else {
                new Main().setVisible(true);
            }
//            System.out.println("DBClick"); //Evento do Duplo Click
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteCancelarActionPerformed
        this.setVisible(false);
        if (tela_anterior.equals(new ContaCadastro().getTitle())) {
            new ContaCadastro().setVisible(true);
        } else if (tela_anterior.equals(new ClienteCadastro().getTitle())) {
            new ClienteCadastro().setVisible(true);
        } else if (tela_anterior.equals(new ContaGerenciar().getTitle())) {
            new ContaGerenciar().setVisible(true);
        } else {
            new Main().setVisible(true);
        }
    }//GEN-LAST:event_btClienteCancelarActionPerformed

    // radio nome
    private void optNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optNomeActionPerformed
        optSNome.setSelected(false);
        optRg.setSelected(false);
        optCPF.setSelected(false);
    }//GEN-LAST:event_optNomeActionPerformed

    private void btClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteBuscarActionPerformed
        // Clicou buscar
        ClienteDAO dao = new ClienteDAO();
        String opt = "nein";
        String data = txtPesquisa.getText();
        if(optCPF.isEnabled()){
            opt = "cpf";            
        }
        else if(optNome.isEnabled()){
            opt = "nome";
        }
        else if(optRg.isEnabled()){
            opt = "rg";
        }
        else if(optSNome.isEnabled()){
            opt = "sobrenome";
        }
        if(!data.equals("nein")){
            // select do banco
            cliList = dao.selectCliente(opt,data);
            Object[][] linhas = new Object[cliList.size()][4];
            int i = 0;
            
            for(Cliente x: cliList ){
                linhas[i][0] = x.getCPF();
                linhas[i][1] = x.getNome();
                linhas[i][2] = x.getSobreNome();
                linhas[i][3] = x.getSalario();
                i++;
            }
            String[] colunas = {"CPF","Nome","Sobrenome","Salário"};
            DefaultTableModel model = new DefaultTableModel(linhas,colunas);
            tblCliente.setModel(model);
            model.fireTableDataChanged();
            
        } else {
            // pop-up "selecione uma radio"
        }
        
        
    }//GEN-LAST:event_btClienteBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClienteBuscar;
    private javax.swing.JButton btClienteCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optCPF;
    private javax.swing.JRadioButton optNome;
    private javax.swing.JRadioButton optRg;
    private javax.swing.JRadioButton optSNome;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
