package com.robermejia.c_fundamentos_estructura_basicas.b_variables;

public class c_Espacio_Memoria {
    // Lo más usado
    static String nombre = "Roberto";
    static int edad = 25;
    static double peso = 72.5d;
    static String pais = "Perú";

    // Poco veces usados
    static long numeroLargo = 12345678;

    public static void main(String[] args) {
        System.out.println("Variables: " + nombre + " " + edad + " " + peso + " " + pais + " " + numeroLargo);

        //Capacidad Bytes
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("====================");

        //Capacidad Sort
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("====================");

        //Capacidad Integer
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("====================");

        //Capacidad Long
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("====================");

        //Capacidad Double
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("====================");

        //Capacidad Float
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("====================");

        //Variables de tipo letra

        //Capacidad Char
        System.out.println(Character.BYTES);
        System.out.println(Character.SIZE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println("====================");

        // NO EXISTE LA CONSTANTE STRING
    }
}
