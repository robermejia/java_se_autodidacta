package com.robermejia.p_excepciones;

import javax.swing.JOptionPane; 

/*
Llamada recursiva:
La línea main(args); es un ejemplo de recursión. En este caso, el método main se 
está llamando a sí mismo. Esto se utiliza para reiniciar el proceso de entrada de 
datos después de que se ha manejado una excepción (como un error de formato o una 
división por cero). Sin embargo, es importante tener en cuenta que llamar al 
método main de esta manera no es una práctica recomendada en la mayoría de los 
casos, ya que puede llevar a un desbordamiento de pila (stack overflow) si se 
producen demasiadas llamadas recursivas sin una condición de salida adecuada.

Terminación del programa:
La línea System.exit(0); se utiliza para terminar el programa. Este método se 
invoca para cerrar la aplicación de manera controlada, y el argumento 0 indica 
que el programa se ha cerrado correctamente. Este es un enfoque común para 
finalizar un programa en Java.
*/
public class Recursión_y_Finalización_del_programa {
    public static void main(String[] args) {
        int x, y; 
        try {

            x = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un número"));

            y = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese otro número"));

            JOptionPane.showConfirmDialog(null, "La división de " + x + " / " + y + " es: " + (x / y));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Este carácter no admite letras.");
            // Llama nuevamente al método main para reiniciar el proceso
            main(args);
            // Termina el programa con un código de salida 0 (indica que se cerró correctamente)
            System.exit(0);
        } catch (ArithmeticException c) {

            JOptionPane.showMessageDialog(null, "Este carácter no admite cero.");
            // Llama nuevamente al método main para reiniciar el proceso
            main(args);
            // Termina el programa con un código de salida 0 (indica que se cerró correctamente)
            System.exit(0);
        }
    }
}