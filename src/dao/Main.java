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

/**
 *
 * @author Lemke
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas", "Lemke", "123", "111", "Sei", 0, 1, 2, 2000);
        ContaDAO dao= new ContaDAO();
//        ContaInvestimento conta = new ContaInvestimento(cliente, 0, 50, 50);
//        ContaCorrente conta = new ContaCorrente(cliente, 150, 200);
        
//        dao.adiciona(conta);
        
        Conta c = dao.consulta(cliente);
        System.out.println(c.getSaldo());
        
//        c.deposita(100);
//        c.saca(50);
//        c.remunera();
//        dao.altera(c);
//        System.out.println(c.getSaldo());
        
    }
}
