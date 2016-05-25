/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Classes.Cliente;
import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaInvestimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lemke
 */
public class ContaDAO {

    private final String stmtAdiciona = "insert into conta (saldo,limite,montanteMinimo, depositoMinimo, cliente_cpf) values (0,?,?,?,?)";
    private final String stmtSeleciona = "select conta.* from conta join cliente on cliente.cpf = conta.cliente_cpf where cliente.cpf=?";
    private final String stmtAltera = "update conta set limite=?, montanteMinimo=?, depositoMinimo=?, saldo=? where cliente_cpf=?";

    public void adiciona(Conta c) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.prepareStatement(stmtAdiciona);

            if (c instanceof ContaInvestimento) {
                ContaInvestimento investimento = (ContaInvestimento) c;
                stmt.setString(1, null);
                stmt.setDouble(2, investimento.getMontanteMinimo());
                stmt.setDouble(3, investimento.getDepositoMinimo());

            } else if (c instanceof ContaCorrente) {
                ContaCorrente corrente = (ContaCorrente) c;
                stmt.setDouble(1, corrente.getLimite());
                stmt.setString(2, null);
                stmt.setString(3, null);
            }

            stmt.setString(4, c.getDono().getCPF());

            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fechar(stmt, con, null);
        }
    }

    public Conta consulta(Cliente c) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Conta conta = null;

        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.prepareStatement(stmtSeleciona);
            stmt.setString(1, c.getCPF());

            rs = stmt.executeQuery();

            if (rs.next()) {
                if (rs.getString("limite") != null) {
                    ContaCorrente corrente = new ContaCorrente(c, rs.getDouble("saldo"), rs.getDouble("limite"));
                    conta = (ContaCorrente) corrente;
                } else {
                    ContaInvestimento investimento = new ContaInvestimento(c, rs.getDouble("saldo"),
                            rs.getDouble("montanteMinimo"), rs.getDouble("depositoMinimo"));
                    conta = (ContaInvestimento) investimento;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fechar(stmt, con, null);
            return conta;
        }
    }

    public void altera(Conta c) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.prepareStatement(stmtAltera);

            if (c instanceof ContaInvestimento) {
                ContaInvestimento investimento = (ContaInvestimento) c;
                stmt.setString(1, null);
                stmt.setDouble(2, investimento.getMontanteMinimo());
                stmt.setDouble(3, investimento.getDepositoMinimo());

            } else if (c instanceof ContaCorrente) {
                ContaCorrente corrente = (ContaCorrente) c;
                stmt.setDouble(1, corrente.getLimite());
                stmt.setString(2, null);
                stmt.setString(3, null);
            }

            stmt.setDouble(4, c.getSaldo());
            stmt.setString(5, c.getDono().getCPF());

            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fechar(stmt, con, null);
        }
    }

    public void fechar(PreparedStatement stmt, Connection con, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao fechar" + e.getMessage());
        }
    }
}
