package com.robermejia.c_fundamentos_estructura_basicas.e_clase_string;

public class clase_string {

    public static void main(String[] args) {
        String nombre = "Roberto";

    // ===================== MÉTODOS DE LA CLASE STRING ========================
    // lenght()
    // Número de caarcteres (devuelve un: Integer)
    System.out.println("nombre.length() = " + nombre.length());
    // concat()
    // concatena Strings y se puede inidando tambien. (devuelve un: String)
    System.out.println("nombre.concat() = " + nombre.concat(" es un profesional."));

    // toLowerCase(String)
    // Convierte a minuscula la cadena o caracter. (devuelve un: String)
    System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

    // toUpperCase(String)
    // Convierte a mayuscula la cadena o caracter. (devuelve un: String)
    System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

    // equals(String b)
    // compara si ambas son iguales, por valor. (Boolean)
    System.out.println("nombre.equals(\"roberto\") = " + nombre.equals("roberto"));

    // equealsIgnoreCase(String b)
    // compara si son iguales sin importar Las mayusculas o las minusculas. (devuelve un: Boolean)
    System.out.println("iqualsIgnoreCase(\"ROBERTO\") = " + nombre.equalsIgnoreCase("ROBERTO"));

    // compareTo(String b)
    // Compara(>, =, <) y de vuelve: -n: Si es anterior; 0: si son iguales; +n: Si es posterior. (devuelve un: Integer)
    System.out.println("nombre.compareTo(\"Roberto\") = " + nombre.compareTo("Roberto"));

    // trim()
    // Crea un nuevo objeto y eliminando el pacio vacio al inicio y al final. (devuelve un: String)
    System.out.println("nombre.trim() = " + nombre.trim());

    // charAt(int posicion)
    // Extrae un carácter en la posición indicada. (devuelve un: Char)
    System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

    // toCharArray()
    // Convierte la cadena en un erreglo de caracteres (devuelve un: char[]).
    System.out.print("nombre.toCharArray() = ");
    char[] nombreArray = nombre.toCharArray();
    for (int i = 0; i < nombreArray.length; i++) {
        System.out.print(nombreArray[i]);
        if (i < nombreArray.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("");

    // substring(int a, int b)
    // Extrae la sub-cadena entre las posiciones a y b (devuelve un: String).
    System.out.println("nombre.subString(1, 4) = " + nombre.substring(1, 4));

    // substring(int desde)
    // Extrae la sub-cadean desde la posición indicada hasta el final de la cadena (devuelve un: String).
    System.out.println("nombre.subString(1) = " + nombre.substring(1));

    // replace(String)
    // Reemplaza un String por otro (devuelve un: String)
    System.out.println("nombre.replace(\"o\", \".\" ) = " + nombre.replace("a", "."));

    // indexOf(String cadena)
    // Indican en que posición se encuentra el carácter (o cadena) buscando desde el principio (devuelve un:in).
    System.out.println("nombre.indexOf(\'t\') = " + nombre.indexOf('t'));

    // lastIndexOf(String cadena)
    // Indica en que posición se encuentra el caracter(o cadena) buscando desde el final (devuelve un: in).
    System.out.println("nombre.lastIndexOf(\'o\') = " + nombre.lastIndexOf('o'));

    // startsWith(String prefijo)
    // Dice si la cadena comienza con el prefijo indicado (devuelve un: Boolean).
    System.out.println("nombre.startWith(\"Ro\") = " + nombre.startsWith("Ro"));

    // endsWith(String sufijo)
    // Dice si la cadena termina con el sufijo. (devuelve un: Boolean)
    System.out.println("nombre.endsWith(\"to\") = " + nombre.endsWith("to"));

    // split(String patron)
    // Divide la cadena en varias subcadenas utlizando el patrón indicado como separador. (devuelve un: String[]
    System.out.println("nombre.split(\" - \") = " +  nombre.split(" - "));
        System.out.print("nombre.split(\" - \") = ");
        String[] nombreArray2 = nombre.split(" - ");
        for (int i = 0; i < nombreArray2.length; i++) {
            System.out.println(nombreArray2[i]);
        }
        System.out.println("");
    
    }

}
