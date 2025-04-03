package com.robermejia.c_fundamentos_estructura_basicas.b_variables;

public class b_Variables {
    public static void main(String[] args) {
        // Declaración e inicialización de variables:

        /*
         * Declaración: Se especifica el tipo de dato y el nombre de la variable.
         * Inicialización: Se asigna un valor a la variable.
         * NOTA: Todas las variables en Java deben estar inicializadas.
         */

        int edad;          // Declaración de una variable entera (int) llamada 'edad' sin inicializar.
        edad = 30;         // Inicialización de la variable 'edad'.

        String nombre = "Juan"; // Declaración e inicialización de una variable de tipo String llamada 'nombre'.

        double altura = 1.85; // Declaración e inicialización de una variable de tipo double llamada 'altura'.

        boolean esMayorDeEdad = true; // Declaración e inicialización de una variable booleana llamada 'esMayorDeEdad'.

        char inicial = 'J';  // Declaración e inicialización de una variable de tipo char llamada 'inicial'.


        // Impresión de los valores de las variables:

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es mayor de edad: " + esMayorDeEdad);
        System.out.println("Inicial: " + inicial);


        // Reasignación de valores a las variables:

        edad = 31; // Se cambia el valor de la variable 'edad'.
        System.out.println("Nueva edad: " + edad);


        // Variables constantes:

        /**
         * Las variables constantes se declaran con la palabra clave 'final'.  Su valor no puede cambiar después de la inicialización.
         */
        final double PI = 3.14159; // Declaración de una constante llamada 'PI'.
        // PI = 3.14; // Esto generaría un error de compilación porque se intenta cambiar el valor de una constante.

        System.out.println("Valor de PI: " + PI);


        // Ejemplo de una variable local:

        /**
         * Una variable local se declara dentro de un método o bloque de código.  Solo es accesible dentro de ese ámbito.
         */
        int numeroLocal = 10;
        System.out.println("Número local: " + numeroLocal);


        //Ejemplo de variable de instancia (se vería en una clase más compleja):
        //Estas variables se declaran fuera de cualquier método y se asocian con objetos de la clase.

    }
}
