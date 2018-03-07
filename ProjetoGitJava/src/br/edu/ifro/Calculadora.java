
package br.edu.ifro;


public class Calculadora {

public double soma (double  num1, double num2){
    return num1 + num2;
    
}   

public double subtracao (double  num1, double num2){
    return num1 - num2;
    
}  
public double divisao (double  num1, double num2){
    return num1 / num2;
    
}  
public double Mutiplicacao (double  num1, double num2){
    return num1 * num2;
    
}  

public static void main (String []args){
    Calculadora c = new Calculadora();
}
}
