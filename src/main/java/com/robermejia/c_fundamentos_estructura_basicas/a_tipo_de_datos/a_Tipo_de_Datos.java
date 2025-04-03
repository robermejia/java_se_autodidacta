package com.robermejia.c_fundamentos_estructura_basicas.a_tipo_de_datos;

public class a_Tipo_de_Datos {

    public static void main(String[] args) {
        // Tipos de datos numéricos enteros:

        /**
         * byte:  Número entero de 8 bits ( -128 a 127).  Útil para ahorrar memoria cuando se trabaja con números pequeños.
         */
        byte numeroByte = 10;
        System.out.println("Valor byte: " + numeroByte);


        /**
         * short: Número entero de 16 bits (-32,768 a 32,767).  Similar a byte, pero con mayor rango.
         */
        short numeroShort = 20000;
        System.out.println("Valor short: " + numeroShort);


        /**
         * int: Número entero de 32 bits. El tipo más común para números enteros.
         */
        int numeroInt = 1000000;
        System.out.println("Valor int: " + numeroInt);


        /**
         * long: Número entero de 64 bits.  Se utiliza para números enteros muy grandes.  Se debe agregar una "L" al final del número literal.
         */
        long numeroLong = 9223372036854775807L;
        System.out.println("Valor long: " + numeroLong);


        // Tipos de datos numéricos de punto flotante:

        /**
         * float: Número de punto flotante de 32 bits (precisión simple).  Se debe agregar una "f" o "F" al final del número literal.
         */
        float numeroFloat = 3.14159f;
        System.out.println("Valor float: " + numeroFloat);


        /**
         * double: Número de punto flotante de 64 bits (precisión doble). El tipo más común para números de punto flotante.
         */
        double numeroDouble = 2.71828;
        System.out.println("Valor double: " + numeroDouble);


        // Tipo de dato booleano:

        /**
         * boolean:  Representa un valor booleano, que puede ser true o false.
         */
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Valor booleano verdadero: " + verdadero);
        System.out.println("Valor booleano falso: " + falso);



        // Tipo de dato carácter:

        /**
         * char: Representa un solo carácter Unicode. Se utiliza entre comillas simples.
         */
        char caracter = 'A';
        System.out.println("Valor char: " + caracter);


        // Tipo de dato String (cadena de caracteres):

        /**
         * String:  Representa una secuencia de caracteres.  No es un tipo de dato primitivo, sino una clase.
         */
        String texto = "Hola, mundo!";
        System.out.println("Valor String: " + texto);


        //Ejemplo de conversión de tipos (casting):

        int numEntero = 10;
        double numDecimal = (double) numEntero; //se convierte el entero a double
        System.out.println("Conversion de int a double: "+ numDecimal);

        //Nota: Es importante tener en cuenta la posible pérdida de información al realizar conversiones de tipos.

    }
}
