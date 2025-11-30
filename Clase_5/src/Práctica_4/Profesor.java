package Práctica_4;
import java.util.ArrayList;

// CLASE HIJA: PROFESOR
public class Profesor extends Persona {
    private ArrayList<Alumno> alumnos;



    // Constructor completo
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    // Metodo para agregar un alumno
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
}