package com.robermejia.c_fundamentos_estructura_basicas.string;

public class String_test {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        // Usando Builder
        StringBuilder sb = new StringBuilder(a);


        // CASO 1
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            c = c.concat(a).concat(b).concat("\n"); // Usando contact()
        }
        long fin = System.currentTimeMillis();
        System.out.println("CASO 1: Usando concat() - Tiempo: " + (fin - inicio) + " ms");


        // CASO 2
        c = a;
        inicio = System.currentTimeMillis();
        String c2 = c;
        for (int i = 0; i < 100000; i++) {
            c2 += a + b + "\n"; // Usando operadores
        }
        fin = System.currentTimeMillis();
        System.out.println("CASO 2: Usando operadores - Tiempo: " + (fin - inicio) + " ms");


        // CASO 3
        sb = new StringBuilder(a);
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(a).append(b).append("\n"); // Usando Builder
        }
        fin = System.currentTimeMillis();
        System.out.println("CASO 3: Usando StringBuilder - Tiempo: " + (fin - inicio) + " ms");

        // NOTA: ESPERAR A QUE TERMINE DE RECORRER
    }

}
