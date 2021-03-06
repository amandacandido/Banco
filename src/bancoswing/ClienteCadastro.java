/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoswing;

import Classes.Cliente;
import Classes.Conta;
import dao.ClienteDAO;
import dao.ContaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lemke
 */
public class ClienteCadastro extends javax.swing.JFrame {

    Cliente cliente;

    /**
     * Creates new form ClienteCadastro
     */
    public ClienteCadastro(Cliente c) {
        initComponents();
        if (c == null) {
            txtClienteCPF.setEnabled(true);

            btClienteExcluir.setEnabled(false);
            btClienteConta.setEnabled(false);
        } else {
            txtClienteCPF.setEnabled(false);

            btClienteExcluir.setEnabled(true);

            ContaDAO dao = new ContaDAO();
            Conta conta = dao.consulta(c);
            if (conta == null) {
                btClienteConta.setEnabled(true);
            }else{
                btClienteConta.setEnabled(false);
            }

            txtClienteNome.setText(c.getNome());
            txtClienteSNome.setText(c.getSobreNome());
            txtClienteSalario.setText("" + c.getSalario());
            txtClienteCPF.setText(c.getCPF());
            txtClienteRg.setText(c.getRG());
            txtClienteRua.setText(c.getRua());
            txtClienteNumero.setText("" + c.getNumero());
            txtClienteCidade.setText("" + c.getCidade());
            txtClienteUF.setText("" + c.getUF());

            cliente = c;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtClienteSNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteSalario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClienteRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClienteRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtClienteNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtClienteCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtClienteUF = new javax.swing.JTextField();
        btClienteSalvar = new javax.swing.JButton();
        btClientePesquisar = new javax.swing.JButton();
        btClienteCancelar = new javax.swing.JButton();
        btClienteExcluir = new javax.swing.JButton();
        btClienteConta = new javax.swing.JButton();

        jLabel6.setText("RG");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobre Nome:");

        jLabel10.setText("Salário:");

        jLabel3.setText("RG");

        jLabel4.setText("CPF:");

        jLabel5.setText("Rua:");

        jLabel7.setText("Nº");

        txtClienteNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteNumeroActionPerformed(evt);
            }
        });

        jLabel9.setText("Cidade:");

        jLabel8.setText("UF:");

        txtClienteUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteUFActionPerformed(evt);
            }
        });

        btClienteSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_save_black_18dp_1x.png"))); // NOI18N
        btClienteSalvar.setText("Salvar");
        btClienteSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteSalvarActionPerformed(evt);
            }
        });

        btClientePesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_search_black_18dp_1x.png"))); // NOI18N
        btClientePesquisar.setText("Pesquisar");
        btClientePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientePesquisarActionPerformed(evt);
            }
        });

        btClienteCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_cancel_black_18dp_1x.png"))); // NOI18N
        btClienteCancelar.setText("Cancelar");
        btClienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteCancelarActionPerformed(evt);
            }
        });

        btClienteExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_delete_black_18dp_1x.png"))); // NOI18N
        btClienteExcluir.setText("Excluir");
        btClienteExcluir.setEnabled(false);
        btClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteExcluirActionPerformed(evt);
            }
        });

        btClienteConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_forward_black_18dp_1x.png"))); // NOI18N
        btClienteConta.setText("Criar Conta");
        btClienteConta.setEnabled(false);
        btClienteConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteSNome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteUF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btClienteConta)
                            .addGap(46, 46, 46)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClientePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtClienteSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtClienteSNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtClienteUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteConta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteSalvar)
                    .addComponent(btClientePesquisar)
                    .addComponent(btClienteCancelar)
                    .addComponent(btClienteExcluir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteNumeroActionPerformed

    private void txtClienteUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteUFActionPerformed

    private void btClienteSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteSalvarActionPerformed
        ClienteDAO dao = new ClienteDAO();

        Cliente c = new Cliente(txtClienteNome.getText().toString(), txtClienteSNome.getText().toString(),
                txtClienteCPF.getText().toString(), txtClienteRg.getText().toString(),
                txtClienteRua.getText().toString(), Integer.parseInt(txtClienteNumero.getText()),
                Integer.parseInt(txtClienteCidade.getText()), Integer.parseInt(txtClienteUF.getText()),
                Double.parseDouble(txtClienteSalario.getText()));

        dao.insertCliente(c);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "OK", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btClienteSalvarActionPerformed

    private void btClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteCancelarActionPerformed
        this.setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_btClienteCancelarActionPerformed

    private void btClientePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientePesquisarActionPerformed
        this.setVisible(false);
        new ClientePesquisa(this.getTitle()).setVisible(true);
    }//GEN-LAST:event_btClientePesquisarActionPerformed

    private void btClienteContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteContaActionPerformed
        this.setVisible(false);
        new ContaCadastro(cliente).setVisible(true);
    }//GEN-LAST:event_btClienteContaActionPerformed

    private void btClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteExcluirActionPerformed
        ClienteDAO dao = new ClienteDAO();
        dao.deleteCliente(cliente);
        JOptionPane.showMessageDialog(null, "Excluído com sucesso!", "OK", JOptionPane.INFORMATION_MESSAGE);

        this.setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_btClienteExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClienteCancelar;
    private javax.swing.JButton btClienteConta;
    private javax.swing.JButton btClienteExcluir;
    private javax.swing.JButton btClientePesquisar;
    private javax.swing.JButton btClienteSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteCidade;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteNumero;
    private javax.swing.JTextField txtClienteRg;
    private javax.swing.JTextField txtClienteRua;
    private javax.swing.JTextField txtClienteSNome;
    private javax.swing.JTextField txtClienteSalario;
    private javax.swing.JTextField txtClienteUF;
    // End of variables declaration//GEN-END:variables
}
