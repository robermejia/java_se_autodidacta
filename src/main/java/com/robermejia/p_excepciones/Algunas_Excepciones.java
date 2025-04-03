package com.robermejia.p_excepciones;

import javax.swing.JOptionPane;

public class Algunas_Excepciones {
    public static void main(String[] args) {
        int x, y;
        
        for (int i = 0; i < 4; i++) {
            
            try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Ingrese un número"));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Ingrese otro número"));
            JOptionPane.showConfirmDialog(null,"la division de " + x + " + " + y + " es: " + (x/y));
            
            // NumberFormatException e (Error al poner un caracter en lugar de un número.)
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Este caracter no es admite letras.");
            // AritmeticException e (Error al poner un cero donde no lo permite.)
            } catch (ArithmeticException c){
                JOptionPane.showMessageDialog(null, "Este caracter no es admite cero.");
            }     
        }
        
    }
}