
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
        Calculadora cal = new Calculadora();
    }
}
