package com.robermejia.operadores.operaciones_aritmeticas;

import javax.swing.JOptionPane;

// Operaciones Aritmeticas comunes
public class OperacionAritmetica {
    int num1;
    int num2;

    public int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicacion(int num1, int num2) {
        int multiplicion = num1 * num2;
        return multiplicion;
    }

    public int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public int modulo(int num1, int num2) {
        int suma = num1 % num2;
        return suma;
    }

    public static void main(String[] args) {
        OperacionAritmetica ope1 = new OperacionAritmetica();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));

        int resultado1 = ope1.suma(num1, num2);
        int resultado2 = ope1.resta(num1, num2);
        int resultado3 = ope1.multiplicacion(num1, num2);
        int resultado4 = ope1.division(num1, num2);
        int resultado5 = ope1.modulo(num1, num2);

        System.out.println("La suma es: " + resultado1);
        System.out.println("La resta es: " + resultado2);
        System.out.println("La multiplicación es: " + resultado3);
        System.out.println("La division es: " + resultado4);
        System.out.println("El módulo es: " + resultado5);
    }
}
