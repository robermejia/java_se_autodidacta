package com.robermejia.c_fundamentos_estructura_basicas.operadores.divisible;

import javax.swing.JOptionPane;

public class Divisible {

    int num;

    public String numeroDivisible(int num) {
        if (num % 2 == 0) {
            return "Este número 'SI' es divisible entre 2.";
        } else {
            return "Este número 'NO' es divisible entre 2.";
        }
    }

    public static void main(String[] args) {
        Divisible divisible = new Divisible();
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para ver si es divisible entre 2."));
        String resultado = divisible.numeroDivisible(num);
        JOptionPane.showMessageDialog(null, resultado);
    }

}
