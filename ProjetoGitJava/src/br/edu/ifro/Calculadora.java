/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

/**
 *
 * @author 03575834261
 */
public class Calculadora {

    
    public double soma (double num1, double num2) {
        return num1 + num2;
    }
      public double subtracao (double num1, double num2) {
        return num1 - num2;
    }
        public double divisao (double num1, double num2) {
         return num1 / num2;
    }
          public double multiplicacao (double num1, double num2) {
           return num1 * num2;
    }
          
           public static void main(String [] args){
               Calculadora c = new Calculadora ();
            double num1 =  Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite um número:")),
                   num2 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite outro número:"));         
                    
                c.soma(num1,num2);
                c.subtracao(num1,num2);
                c.divisao(num1,num2);
                c.multiplicacao(num1,num2);
                
                System.out.println (c.soma(num1,num2));
       
                    System.out.println (c.subtracao(num1,num2));
       
                        System.out.println (c.divisao(num1,num2));
                            System.out.println (c.multiplicacao(num1,num2));
                    }
}
