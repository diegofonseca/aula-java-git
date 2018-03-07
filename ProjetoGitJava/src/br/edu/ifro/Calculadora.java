package br.edu.ifro;

public class Calculadora {

    public double Soma(double num1, double num2){
    return num1 + num2;   
    }
    public double Subtracao(double num1, double num2){
    return num1 - num2;    
    }
    public double Divisao(double num1, double num2){
    return num1 / num2;    
    }
    public double Multiplicacao(double num1, double num2){
    return num1 * num2;   
} 

public static void main (String [] Args){
    double num1 = 10;
    double num2 = 20;
    Calculadora calculadora = new Calculadora ();
    System.out.println (calculadora.Soma(num1,num2));
    System.out.println (calculadora.Subtracao(num1,num2));
    System.out.println (calculadora.Divisao(num1,num2));
    System.out.println (calculadora.Multiplicacao(num1,num2));

}
}
