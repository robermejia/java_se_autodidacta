package com.robermejia.c_fundamentos_estructura_basicas.b_variables;

import java.util.ArrayList;


// =================== NOTA: No se puede declarar e inicializar en distintas lineas con var. ===========================

public class d_Inferencia_de_Tipos {

    public static void saludo() {
        var hello = "Hola";
        System.out.println("hello = " + hello);
    }


    public static void main(String[] args) {
        for (var i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        ArrayList<String> miLista= new ArrayList<>();
        miLista.add("Marcos");
        saludo();

    }


}
