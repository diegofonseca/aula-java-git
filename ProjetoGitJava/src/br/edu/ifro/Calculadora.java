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
        
    }
}
