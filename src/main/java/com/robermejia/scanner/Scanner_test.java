package com.robermejia.scanner;

import java.util.Scanner;

public class Scanner_test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa un número."); // Mostrar mensaje al usuario
        String num = s.nextLine(); // Leer la entrada del usuario
        System.out.println("El número ingresado es: " + num);
    }

}
