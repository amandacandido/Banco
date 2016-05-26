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
public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente (Cliente c, double saldo, double limite){
        super(c, saldo);
        this.limite = limite;
    }
    
    public double getLimite(){
        return limite;
    }
        
    @Override
    public boolean saca(double valor) {
        if (valor <= super.getSaldo() + limite){
            if (super.saca(valor))
                return true;
            else
                return false;
        }else{
            return false;
        }        
    }    
    
    @Override
    public void remunera(){
        super.deposita((super.getSaldo()*1.01) - super.getSaldo());
    }
}
