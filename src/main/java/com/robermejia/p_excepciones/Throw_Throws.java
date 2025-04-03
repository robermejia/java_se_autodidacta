package com.robermejia.p_excepciones;

import javax.swing.JOptionPane;

public class Throw_Throws {

    public static void main(String[] args) {
        
    // try: Bloque donde puede ocurrir la excepción.
    // catch: Es como el "else" del try (se ejecuta al dispararse una excepción en el bloque try).
    // finally: Bloque de código que se ejecuta siempre (sin importar si hubieron errores o no).
    // throw: Lanzar una excepción cualquiera.
    // throws: Determinar que excepciones puede lanzar un método.
      
    int x,y,n,m;
    
    // Bucle de suma y división repetido 2 veces
    for (int i = 0; i < 2; i++) {
    // try
            try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para sumarlo."));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número para sumarlo."));
                sumar(x, y); 
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para dividirlo."));
            m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número para dividirlo."));
                dividir(n, m);
    // catch      
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Este valor es una letra y no un número.");
            } catch (ArithmeticException a) {
                JOptionPane.showMessageDialog(null, "Este valor no es un valor válido, no se puede dividir entre 0.");
            }
        }
    }
    
    // Método de suma
    public static int sumar(int num1, int num2) {
        int num3 = 0;
        num3 = num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma de " + num1 + " y " + num2 + " es: " + num3);
        return num3;
    }
    
    // Método de división
    // throws (Indica que tipo de excepción va tener el método "dividir")
    public static int dividir(int num1, int num2) throws ArithmeticException {
        int num3 = 0;
        if (num2 == 0) {
        // throw (Muestra el cualquier tipo de excepción)
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        num3 = num1 / num2;
        JOptionPane.showMessageDialog(null, "La division de " + num1 + " y " + num2 + " es: " + num3);
        return num3;
    }
}
