/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

/**
 *
 * @author 04592828240
 */
public class Calculadora {

    public double soma(double x, double y) {
        return x + y;
    }

    public double subtracao(double x, double y) {
        return x - y;
    }

    public double divisao(double x, double y) {
        return x / y;
    }

    public double multiplicação(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
     double x =10;
     double y=20;
     Calculadora Calculadora = new Calculadora();
     System.out.println(Calculadora.soma(x,y));
     
    }
    
}