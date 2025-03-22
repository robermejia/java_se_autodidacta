package com.robermejia.joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane_test {

    public void saludo(){
        // Ventana emergente para escribir texto
        // JOptionPane.showImputDialog(String)
        String name = JOptionPane.showInputDialog("Ingresa el nombre de la persona a saludar.");
        String mensaje = "Bienvenido " + name;
        // Ventana emergente de mensaje
        // JOptionPane.showMessageDialog(null, obj)
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static void main(String[] args) {
        // Instancia
        JOptionPane_test saludando = new JOptionPane_test();
        saludando.saludo();        
    }
}
