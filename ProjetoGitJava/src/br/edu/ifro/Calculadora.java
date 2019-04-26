
package br.edu.ifro;

import sun.applet.Main;

/**
 *
 * @author 03358365263
 */
public class Calculadora {

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
 //double n1 = 10;
 //double n2 = 20;
 Calculadora calc = new Calculadora();
    System.out.println(calc.Soma(n1,n2));
    System.out.println(calc.Subtracao(n1,n2));
    System.out.println(calc.Multiplicacao(n1,n2));
}

}
