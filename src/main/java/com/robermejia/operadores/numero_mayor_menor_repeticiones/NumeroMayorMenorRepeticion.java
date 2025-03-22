package com.robermejia.operadores.numero_mayor_menor_repeticiones;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class NumeroMayorMenorRepeticion {
    
    public static void main(String[] args) {
        // Obtener la cantidad de números
        int cantidad = obtenerCantidadNumeros();

        // Obtener los números
        int[] numeros = obtenerNumeros(cantidad);

        // Encontrar el mayor, menor y las repeticiones
        int mayor = numeros[0];
        int menor = numeros[0];
        Map<Integer, Integer> repeticiones = new HashMap<>();

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            repeticiones.put(numero, repeticiones.getOrDefault(numero, 0) + 1);
        }

        // Mostrar el resultado
        mostrarResultados(mayor, menor, repeticiones);
    }

   // Obtiene la cantidad de números del usuario
    private static int obtenerCantidadNumeros() {
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de números:");
        try {
            return Integer.parseInt(cantidadStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return obtenerCantidadNumeros(); // Llamada recursiva en caso de error
        }
    }

    // Obtiene los números del usuario
    private static int[] obtenerNumeros(int cantidad) {
        int[] numeros = new int[cantidad];
        String input = JOptionPane.showInputDialog("Ingrese los números separados por espacios:");
        String[] numerosStr = input.trim().split("\\s+");
        if (numerosStr.length != cantidad) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar la cantidad de números especificada.", "Error", JOptionPane.ERROR_MESSAGE);
            return obtenerNumeros(cantidad); // Llamada recursiva en caso de error
        }
        for (int i = 0; i < cantidad; i++) {
            try {
                numeros[i] = Integer.parseInt(numerosStr[i]);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return obtenerNumeros(cantidad); // Llamada recursiva en caso de error
            }
        }
        return numeros;
    }

    // Muestra los resultados al usuario
    private static void mostrarResultados(int mayor, int menor, Map<Integer, Integer> repeticiones) {
        String resultado = "Número mayor: " + mayor + "\n" +
                "Número menor: " + menor + "\n" +
                "Repeticiones de cada número:\n";
        for (Map.Entry<Integer, Integer> entry : repeticiones.entrySet()) {
            resultado += entry.getKey() + ": " + entry.getValue() + " veces\n";
        }
        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    
    }
}
