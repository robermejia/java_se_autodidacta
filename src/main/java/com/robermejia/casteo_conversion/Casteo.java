package com.robermejia.casteo_conversion;

public class Casteo {
    public static void main(String[] args) {
        /* 
        Caste: Es un tipo específico de conversión que se refiere a la 
        transformación de tipos de datos dentro de la jerarquía de tipos de 
        Java, ya sea de forma implícita o explícita.
        
        Conversión: Es un término más amplio que incluye cualquier tipo de 
        transformación de datos, incluyendo el casteo, pero también abarca otras 
        transformaciones que pueden no estar relacionadas con la jerarquía de 
        tipos.
        */
        
        // De int a double
        int numero = 100;
        double decimal = numero; // Casteo implícito
        System.out.println("int => double: " + decimal);
        // Salida: Int => decimal: 100
        
        
        // De double a int
        int otroNumero = (int) 9.99; // Casteo explícito 
        System.out.println("double => Int: " + otroNumero);
        // Salida: double => int: 9
        
        
        // De int double
        int num = 10;
        double numDouble = (double) num;
        System.out.println("int => double: " + numDouble);
        // Salida: int => double: 10
        
        
        // De int a short
        int numInt = 30000;
        short numShort = (short) numInt;
        System.out.println("int => short: " + numShort);
        // Salida: int => short: 30000
        
        
        // De int a log
        int num2Int = 40000;
        long numLong = (long) num2Int;
        System.out.println("int => log: " + numLong);
        // Salida: int => log: 40000
        
        
        // De int a String
        // NOTA: Esto es una conversion no un casteo
        int num3Int = 50000;
        String cadenaInteger = Integer.toString(num3Int);
        System.out.print("int => String: " + cadenaInteger);
        // Salida: int => String: "50000"
    }
}
