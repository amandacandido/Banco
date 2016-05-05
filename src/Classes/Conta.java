/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Lucas
 */
public abstract class Conta implements ContaInterface{
    private Cliente cliente;
    private int numConta;
    private double saldo;

    @Override
    public Cliente getDono() {
        return cliente;
    }

    @Override
    public int getNumero() {
        return numConta;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean deposita(double valor) {
        if (valor > 0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }        
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }        
    }    
}
