/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeestudo;

import java.util.Scanner;

/**
 *
 * @author Joao Caetano
 */
public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioLiquido(){
        return salarioBruto - imposto;
         }
    public void aumentarSalario(double porcetagem){
        salarioBruto += salarioBruto * porcetagem / 100;
    }
    @Override
    public String toString(){
        return nome + ", $" + String.format("%.2f", salarioLiquido());
        
        
    }
    
            
}
