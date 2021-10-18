/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeestudo;

import java.util.Scanner;

/**
 *
 * @author gabriel villela
 */
public class SalarioImposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Slario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();
        
        System.out.println();
        System.out.println("Funcionário: " + funcionario);
        System.out.println();
        System.out.println("Qual o aumento da porcetagem do salário?");
        double porcetagem = sc.nextDouble();
        funcionario.aumentarSalario(porcetagem);
        
        System.out.println();
        System.out.println("Atualização: " + funcionario);
        
        
                 
        
        
        
        
        
        
        
    }
    
}
