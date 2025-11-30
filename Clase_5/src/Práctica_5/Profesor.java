package Práctica_5;
import java.util.ArrayList;

public class Profesor extends Persona {
    private ArrayList<Alumno> alumnos;

    public Profesor() {
        super();
        this.alumnos = new ArrayList<>();
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    // SOBRESCRITURA del metodo saludar
    @Override
    public void saludar() {
        System.out.println("Hola a todos, bienvenidos");
    }

    // SOBRECARGA: Calificar a un alumno específico
    public void calificar(Alumno alumno, Integer nota) {
        alumno.setNota(nota);
        System.out.println("Se asignó la nota " + nota + " a " + alumno.getNombre() + " " + alumno.getApellido());
    }

    // SOBRECARGA: Calificar a todos los alumnos con la misma nota
    public void calificar(Integer nota) {
        for (Alumno alumno : alumnos) {
            alumno.setNota(nota);
        }
        System.out.println("Se asignó la nota " + nota + " a todos los alumnos");
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void mostrarAlumnos() {
        System.out.println("\n===== LISTA DE ALUMNOS =====");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}