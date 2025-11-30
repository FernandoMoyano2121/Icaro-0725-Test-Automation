package Práctica_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== PRÁCTICA 5: POLIMORFISMO ==========\n");

        // Crear alumnos
        Alumno alumno1 = new Alumno("Juan", "Pérez", "A-2024-001");
        Alumno alumno2 = new Alumno("María", "González", "A-2024-002");
        Alumno alumno3 = new Alumno("Pedro", "Rodríguez", "A-2024-003");

        // Crear profesor y agregar alumnos
        Profesor profesor1 = new Profesor("Ana", "Martínez");
        profesor1.agregarAlumno(alumno1);
        profesor1.agregarAlumno(alumno2);
        profesor1.agregarAlumno(alumno3);

        // Crear no docente
        NoDocente noDocente1 = new NoDocente("Carlos", "López", "Administración");

        // ===== DEMOSTRACIÓN DE SOBRECARGA =====
        System.out.println("===== DEMOSTRACIÓN DE SOBRECARGA =====");

        // Calificar a un alumno específico
        profesor1.calificar(alumno1, 9);

        // Calificar a todos con la misma nota
        profesor1.calificar(7);

        profesor1.mostrarAlumnos();

        // ===== DEMOSTRACIÓN DE POLIMORFISMO =====
        System.out.println("\n===== DEMOSTRACIÓN DE POLIMORFISMO =====");
        System.out.println("Creando una lista de tipo Persona con diferentes objetos:\n");

        // Crear lista polimórfica
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(alumno1);
        personas.add(profesor1);
        personas.add(noDocente1);
        personas.add(alumno2);

        // Recorrer la lista y llamar al metodo saludar()
        // (cada objeto ejecutará su propia versión)
        for (Persona persona : personas) {
            System.out.print(persona.getNombre() + " " + persona.getApellido() + " dice: ");
            persona.saludar();
        }

        System.out.println("\n===== FIN DE LA PRÁCTICA =====");
    }
}


//Salida esperada del programa:
//
//=========== PRÁCTICA 5: POLIMORFISMO ==========
//
//======== DEMOSTRACIÓN DE SOBRECARGA ==========
//Se asignó la nota 9 a Juan Pérez
//Se asignó la nota 7 a todos los alumnos
//
//========== LISTA DE ALUMNOS ===============
//Juan Pérez (Matrícula: A-2024-001, Nota: 7)
//María González (Matrícula: A-2024-002, Nota: 7)
//Pedro Rodríguez (Matrícula: A-2024-003, Nota: 7)
//
//======= DEMOSTRACIÓN DE POLIMORFISMO =====
//Creando una lista de tipo Persona con diferentes objetos:
//
//Juan Pérez dice: ¡Qué onda!
//Ana Martínez dice: Hola a todos, bienvenidos
//Carlos López dice: Buen día
//María González dice: ¡Qué onda!
//
//========== FIN DE LA PRÁCTICA ===============