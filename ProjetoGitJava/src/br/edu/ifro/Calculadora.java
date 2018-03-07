


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
public double Multiplicacao (double  num1, double num2){
    return num1 * num2;
    
}  

public static void main (String []args){
    double num1 = 10;
    double num2 = 20;
    Calculadora c = new Calculadora();
    System.out.println(c.soma(num1,num2));
    System.out.println(c.subtracao(num1,num2));
    System.out.println(c.divisao(num1,num2));
    System.out.println(c.Multiplicacao(num1,num2));
}
}
