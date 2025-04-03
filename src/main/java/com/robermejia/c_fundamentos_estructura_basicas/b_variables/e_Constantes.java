package com.robermejia.c_fundamentos_estructura_basicas.b_variables;

public class e_Constantes {

    // NOTA: Las constantes de clase por convención el nombre va en MAYUSCULAS.

        // NOTA: Por convención las constantes en main pueden estar en  MINUSCULAS.
        // 1. Constantes de clase (static final): Compartidas por todas las instancias de la clase.
        public static final double PI = 3.14159; // Constante matemática PI.
        public static final int MAX_USUARIOS = 100; // Límite máximo de usuarios.
        public static final String NOMBRE_APLICACION = "MiAplicacion"; // Nombre de la aplicación.


        public static void main(String[] args) {

            // 2. Constantes locales (final):  Su alcance es limitado al bloque de código donde se declaran.
            final int numero = 10; // Constante local, solo accesible dentro de main.
            final String mensaje = "Este es un mensaje."; // Otra constante local.

            // Intentar cambiar el valor de una constante (genera error de compilación):
            // numero = 20; // Esto daría un error.

            System.out.println("Constante de clase PI: " + PI);
            System.out.println("Constante de clase MAX_USUARIOS: " + MAX_USUARIOS);
            System.out.println("Constante de clase NOMBRE_APLICACION: " + NOMBRE_APLICACION);
            System.out.println("Constante local numero: " + numero);
            System.out.println("Constante local mensaje: " + mensaje);


            // 3. Constantes de instancia (final): Cada objeto tiene su propia copia, pero no se puede modificar después
            // de la creación.
            final Persona persona1 = new Persona("Ana", 30); // Referencia final a un objeto Persona.
            final Persona persona2 = new Persona("Juan", 25); // Referencia final a un objeto Persona.
            System.out.println("Persona 1: " + persona1.nombre + ", Edad: " + persona1.edad);
            System.out.println("Persona 2: " + persona2.nombre + ", Edad: " + persona2.edad);


            //persona1 = new Persona("Pedro",40); // Esto daría error, la referencia es final.
            //persona1.edad = 35; // Esto daría error si modificamos la clase Persona para que la edad no sea final.

            // 4. Inmutabilidad vs. Referencia final (con StringBuilder - Objeto mutable)
            final StringBuilder sb = new StringBuilder("Hola"); // Referencia final a un objeto mutable.
            sb.append(" Mundo"); // Esto es válido, modifica el contenido del objeto.
            System.out.println("StringBuilder mutable: " + sb); // Imprime "Hola Mundo".

            // 5. Inmutabilidad con String (Objeto inmutable)
            final String cadena = "Ejemplo";
            //cadena += "Modificado"; //Esto daría error si no creamos una nueva variable.
            String nuevaCadena = cadena + "Modificado"; // Esto es válido, crea una nueva cadena.
            System.out.println("String inmutable: " + nuevaCadena);

        }


        // Clase interna para ilustrar constantes de instancia
        static class Persona {
            final String nombre; //Variable de instancia final
            final int edad; //Variable de instancia final

            Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

        }
}
