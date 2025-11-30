package Práctica_4;

// CLASE MAIN PARA PROBAR
public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada tipo
        Alumno alumno1 = new Alumno("Juan", "Pérez", "A-2024-001");
        alumno1.agregarMateria("Matemática");
        alumno1.agregarMateria("Programación");

        Profesor profesor1 = new Profesor("Ana", "Martínez");
        profesor1.agregarAlumno(alumno1);

        NoDocente noDocente1 = new NoDocente("Carlos", "López", "Administración");

        // Mostrar información
        System.out.println("===== ALUMNO =====");
        System.out.println("Nombre: " + alumno1.getNombre() + " " + alumno1.getApellido());
        System.out.println("Matrícula: " + alumno1.getMatricula());
        System.out.println("Materias: " + alumno1.getMaterias());

        System.out.println("\n===== PROFESOR =====");
        System.out.println("Nombre: " + profesor1.getNombre() + " " + profesor1.getApellido());
        System.out.println("Cantidad de alumnos: " + profesor1.getAlumnos().size());

        System.out.println("\n===== NO DOCENTE =====");
        System.out.println("Nombre: " + noDocente1.getNombre() + " " + noDocente1.getApellido());
        System.out.println("Área: " + noDocente1.getArea());
    }
}
