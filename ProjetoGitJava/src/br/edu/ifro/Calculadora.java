
package br.edu.ifro;

import sun.applet.Main;

/**
 *
 * @author 03358365263
 */
public class Calculadora {
    double n1,
           n2;
    
    public double Soma(double n1, double n2){
     return n1+n2;
}
    public double Subtracao(double n1, double n2){
     return n1-n2;
}
    public double Multiplicacao(double n1, double n2){
     return n1*n2;
}

public static void main (String [] Args){
 double n1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite o 1º número:"));
 double n2 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite o 2º número:"));

}

}
