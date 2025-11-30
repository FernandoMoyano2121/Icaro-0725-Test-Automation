package Práctica_4;

import java.util.ArrayList;

public class Main {
    public static void main(){
//        Estudiante estudiante1= new Estudiante(1001, "María González", 8.5f);
//        System.out.println("ID: " + estudiante1.getId());
//        System.out.println("Nombre Completo:  " + estudiante1.getNombreCompleto());
//        estudiante1.setPromedio(9.5f);
//        System.out.println("Promedio:  " + estudiante1.getPromedio());



//        Alumno alumno1=new Alumno("Az-1032", "Juan","Garcia");
//
//        alumno1.agregarMateria("Fisica");
//        alumno1.agregarMateria("Inglés");
//
//        System.out.println("Materias : " + alumno1.getMaterias());
//
//        Profesor profesor1=new Profesor("Ana", "Martinez" );
//        profesor1.agregarAlumno(alumno1);
//
//        System.out.println("Cantidad de alumnos " + profesor1.getAlumnos().size());
//
//        NoDocente noDocente1=new NoDocente("Carlos", "Lopez", "Administración");



        // Crear alumnos
        Alumno alumno1 = new Alumno("A-2024-001", "Juan","Pérez");
        Alumno alumno2 = new Alumno("A-2024-098", "Anibal","Vargas");
        Alumno alumno3 = new Alumno("A-2024-005", "Vera","Cardonatto");


        //Crear profesor y agregarle alumnos
        Profesor profesor1=new Profesor("Fernando", "Moyano");
        profesor1.agregarAlumno(alumno1);
        profesor1.agregarAlumno(alumno2);
        profesor1.agregarAlumno(alumno3);

        //Crear no docente
        NoDocente noDocente1=new NoDocente("Carlos", "Lopez", "Administración");


        System.out.println("=========DEMOSTRACION DE SOBRECARGA=============");
        profesor1.calificar(alumno2,10);
        profesor1.calificar(7);

        profesor1.mostrarAlumnos();


        System.out.println("\n =============DEMOSTRACION DE POLIMORFISMO:============ ");

        ArrayList<Persona>personas=new ArrayList<>();
        personas.add(alumno1);
        personas.add(profesor1);
        personas.add(noDocente1);
        personas.add(alumno3);

        for(Persona persona:personas) {
            System.out.println();
            persona.saludar();
        }

//        System.out.println("\n =============toString() sin sobreescritura:============ ");
//        profesor1.mostrarAlumnos();

    }
}
