package com.robermejia.p_excepciones;

import javax.swing.JOptionPane;

public class Exception_e {

    public static void main(String[] args) {
        
        int x, y;        
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un número"));
            y = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese otro número"));
            int resultado = x / y;
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
        // Exception e (Error que simplica cualquier tipo de error).
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El denominar es cero hay unn error en la división, no puede ser cero.");
        }
        
    }
}
