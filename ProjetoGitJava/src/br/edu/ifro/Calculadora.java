
package br.edu.ifro;

/**
 *
 * @author 04647218228
 */
public class Calculadora {
    
    public double soma (double j, double k){
        return j + k ;
    }
    public double subitracao (double j , double k){
        return j - k;
    }
    public double multiplicacao (double j, double k){
        return j * k ;
    }
    public double divisao (double j, double k){
        return j / k ;
    }
    public static void main (String [] args){
        double num1 = 10;
        double num2 = 20; 
        Calculadora cal = new Calculadora();
        System.out.println (cal.soma(num1, num2));
        System.out.println (cal.subitracao(num1, num2));
        System.out.println (cal.multiplicacao(num1, num2));
        System.out.println (cal.divisao(num1, num2));
        
    }
}
