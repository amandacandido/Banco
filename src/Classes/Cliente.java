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
public class Cliente {
    private String nome, sobreNome, CPF, RG, rua, Cidade, UF;
    private int numero;
    double salario;
    
    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public String getRua() {
        return rua;
    }
   
    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return Cidade;
    }
    
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }
    
    public void setUF(String UF) {
        this.UF = UF;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
