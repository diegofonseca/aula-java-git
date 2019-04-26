package br.edu.ifro;

import javax.swing.JOptionPane;

public class Calculadora {
    
    public double soma(double a, double b){
        return a+b;
    }
    
    public double subtracao(double a, double b){
        return a-b;
    }
    
    public double divisao(double a, double b){
        return a/b;
    }
    
    public double multiplicacao(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.soma(10, 20));
        System.out.println(c.subtracao(10, 20));
        System.out.println(c.divisao(10, 20));
        System.out.println(c.multiplicacao(10, 20));
    }
}
