/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

/**
 *
 * @author 04421368202
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1= 10;
        double  num2= 20;
                Calculadora calculadora= new Calculadora ();
                
         System.out.println(calculadora.soma(num1, num2));
         System.out.println(calculadora.subtracao(num1, num2));
         System.out.println(calculadora.divisao(num1, num2));
         System.out.println(calculadora.multiplicacao(num1, num2));
    }
    
}
