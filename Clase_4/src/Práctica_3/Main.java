package Práctica_3;

import Practica_1.Estudiante;

public class Main {
    public static void main(String[] args) {
        Practica_1.Estudiante estudiante1 = new Estudiante(1001, "María González", 8.5f);

        // CASO 1: Intentar acceder directamente al atributo (ESTO PRODUCE ERROR)
        // System.out.println(estudiante1.id);
        // Error de compilación: 'id' has private access in 'Estudiante'

        // CASO 2: Acceso correcto usando el getter público
        System.out.println("ID (usando getter): " + estudiante1.getId());

        // CASO 3: Si cambiamos getId() a private, obtendremos un error:
        // Error de compilación: 'getId()' has private access in 'Estudiante'

        // EXPLICACIÓN DEL ENCAPSULAMIENTO:
        System.out.println("\n===== IMPORTANCIA DEL ENCAPSULAMIENTO =====");
        System.out.println("1. Los atributos privados protegen los datos internos");
        System.out.println("2. Los getters/setters públicos permiten acceso controlado");
        System.out.println("3. Podemos agregar validaciones en los setters");

        // Ejemplo de validación en setter (agregaríamos esto en la clase Estudiante)
        estudiante1.setPromedio(10.5f); // Podríamos validar que no supere 10.0
    }
}
