package com.robermejia.operadores.factorial;

import javax.swing.JOptionPane;

public class Factorial {

    int num1;
    int num2;
    
    public String numeroMayor(int num1, int num2){
        if (num1 > num2) {
            return "El primer número 'SI' es mayor al segundo.";
        } else {
            return "El primer número 'NO' es mayor al segundo";
        }
    }

    public static void main(String[] args) {
        Factorial ope1 = new Factorial();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        
        String resultado = ope1.numeroMayor(num1, num2);
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
