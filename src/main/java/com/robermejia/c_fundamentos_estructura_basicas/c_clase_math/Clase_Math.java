package com.robermejia.c_fundamentos_estructura_basicas.c_clase_math;

public class Clase_Math {
    public static void main(String[] args) {

        // 1. Constantes matemáticas:

        System.out.println("Valor de PI: " + Math.PI); // Constante PI.
        System.out.println("Valor de E: " + Math.E);  // Constante E (número de Euler).


        // 2. Funciones trigonométricas:

        double anguloEnRadianes = Math.PI / 4; // 45 grados en radianes.
        System.out.println("Seno de " + anguloEnRadianes + " radianes: " + Math.sin(anguloEnRadianes));
        System.out.println("Coseno de " + anguloEnRadianes + " radianes: " + Math.cos(anguloEnRadianes));
        System.out.println("Tangente de " + anguloEnRadianes + " radianes: " + Math.tan(anguloEnRadianes));

        // 3. Funciones exponenciales y logarítmicas:

        double base = 2;
        double exponente = 3;
        System.out.println(base + " elevado a " + exponente + ": " + Math.pow(base, exponente)); // Potencia.
        System.out.println("Raíz cuadrada de " + 9 + ": " + Math.sqrt(9)); // Raíz cuadrada.
        System.out.println("Logaritmo natural de " + Math.E + ": " + Math.log(Math.E));  // Logaritmo natural (base e).
        System.out.println("Logaritmo en base 10 de 100: " + Math.log10(100)); // Logaritmo en base 10.
        System.out.println("Exponencial de 1: " + Math.exp(1)); // Función exponencial (e^x)


        // 4. Funciones de redondeo:

        double numero = 3.14;
        System.out.println("Redondeo a entero más cercano de " + numero + ": " + Math.round(numero)); // Redondeo a entero.
        System.out.println("Redondeo hacia arriba de " + numero + ": " + Math.ceil(numero)); // Redondeo hacia arriba.
        System.out.println("Redondeo hacia abajo de " + numero + ": " + Math.floor(numero)); // Redondeo hacia abajo.


        // 5. Funciones de valor absoluto y mínimo/máximo:

        double num1 = -5;
        double num2 = 10;
        System.out.println("Valor absoluto de " + num1 + ": " + Math.abs(num1));  // Valor absoluto.
        System.out.println("Máximo entre " + num1 + " y " + num2 + ": " + Math.max(num1, num2)); // Máximo.
        System.out.println("Mínimo entre " + num1 + " y " + num2 + ": " + Math.min(num1, num2)); // Mínimo.

        //6. Generación de números aleatorios:

        double numeroAleatorio = Math.random(); // Genera un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo).
        System.out.println("Número aleatorio entre 0.0 y 1.0: " + numeroAleatorio);

        //Para generar un numero aleatorio en un rango determinado:
        int numeroAleatorioEntre1y10 = (int)(Math.random()*10)+1; //Genera un numero entre 1 y 10 (inclusive)
        System.out.println("Numero aleatorio entre 1 y 10: "+numeroAleatorioEntre1y10);


    }
}
