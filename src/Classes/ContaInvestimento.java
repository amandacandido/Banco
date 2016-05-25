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
public class ContaInvestimento extends Conta {
    private double montanteMinimo, depositoMinimo;

    public ContaInvestimento(Cliente c, double saldo, double montanteMinimo, double depositoMinimo){
        super(c, saldo);
        this.montanteMinimo = montanteMinimo;
        this.depositoMinimo = depositoMinimo;
    }
    
    public double getMontanteMinimo() {
        return montanteMinimo;
    }

    public double getDepositoMinimo() {
        return depositoMinimo;
    }
    
    @Override
    public boolean deposita(double valor) {
        if (valor > depositoMinimo){
            if (super.deposita(valor))
                return true;
            else
                return false;
        }else{
            return false;
        }        
    }    
    
    @Override
    public boolean saca(double valor) {
        if (montanteMinimo <= super.getSaldo() - valor ){
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
        super.deposita((super.getSaldo()*1.02) - super.getSaldo());
    }
}
