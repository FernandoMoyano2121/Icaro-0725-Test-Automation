package Práctica_2;
import Practica_1.Estudiante;

public class Main {
    public static void main(String[] args) {
        // Instanciar un objeto Estudiante con el constructor completo
        Practica_1.Estudiante estudiante1 = new Estudiante(1001, "María González", 8.5f);

        // Mostrar los atributos del estudiante por consola
        System.out.println("===== DATOS DEL ESTUDIANTE =====");
        System.out.println("ID: " + estudiante1.getId());
        System.out.println("Nombre completo: " + estudiante1.getNombreCompleto());
        System.out.println("Promedio: " + estudiante1.getPromedio());
    }
}