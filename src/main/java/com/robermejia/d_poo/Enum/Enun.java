package com.robermejia.d_poo.Enum;

import javax.swing.JOptionPane;

public class Enun {

    public enum DIAS_SEMANA {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }

    public static void enunciado() {

        try {
            String diaIngresado = JOptionPane.showInputDialog(null, "Ingresa un día de la semana:");
            DIAS_SEMANA dia = DIAS_SEMANA.valueOf(diaIngresado.toUpperCase());
            JOptionPane.showMessageDialog(null, "El día del enun elegido en mayuscula sería: " + dia);
        // Salida: El día del enun elegido en mayuscula sería: (DÍA)    
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "El día ingresado no es válido.");
        // Salida: El día ingresado no es válido.
        }
    }
    

    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            enunciado();
        }
        // Salida: El día del enun elegido en mayuscula sería: (DÍA)    
        // Salida: El día del enun elegido en mayuscula sería: (DÍA)    
        // Salida: El día del enun elegido en mayuscula sería: (DÍA)    
        
        // Métodos de ENUN
        // values()
        for (DIAS_SEMANA dia : DIAS_SEMANA.values()) {
            System.out.println("DIA DE LA SEMANA: " + dia);
        }
        // Salida: DIA DE LA SEMANA: "LUNES"
        // Salida: DIA DE LA SEMANA: "MARTES"
        // Salida: DIA DE LA SEMANA: "MIERCOLES"
        // Salida: DIA DE LA SEMANA: "JUEVES"
        // Salida: DIA DE LA SEMANA: "VIERNES"
        // Salida: DIA DE LA SEMANA: "SÁBADO"
        // Salida: DIA DE LA SEMANA: "DOMINGO"

        DIAS_SEMANA dia = DIAS_SEMANA.DOMINGO;
        // name()
        System.out.println("dia.name() = " + dia.name());
        // Salida: "DOMINGO"

        // ordinal()
        System.out.println("dia.ordinal() = " + dia.ordinal());
        // Salida: 6

        try {
            // valuesOf()
            dia = DIAS_SEMANA.valueOf("DOMINGO");
            System.out.println("dia = DIAS_SEMANA.valueOf(\"DOMINGO\") = " + dia);
        // Salida: dia = DIAS_SEMANA.valueOf("DOMINGO") = "DOMINGO"

        } catch (IllegalArgumentException e) {
            System.out.println("Dato mal ingresado o nmo se encuentra en el ENUN.");
        // Salida: Dato mal ingresado o nmo se encuentra en el ENUN.
        }
    }

}
