package Práctica_4;
import java.util.ArrayList;

public class Profesor extends Persona{
    private ArrayList<Alumno> alumnos;


    public Profesor(String nombre, String apellido){
        super(nombre,apellido);
        this.alumnos=new ArrayList<>();
    }

    @Override
    public void saludar(){
        System.out.println("Bienvenidos! ");
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void calificar(Alumno alumno, Integer nota){
        alumno.setNota(nota);
        System.out.println("Se le asignó la nota " + nota + " " +  alumno.getNombre());
    }

    public void calificar(Integer nota){
        for(Alumno alumno:alumnos){
           alumno.setNota(nota);
        }
        System.out.println("Se le asignó la nota " + nota + " a todos los alumnos");
    }

    public void mostrarAlumnos(){
        System.out.println("LISTA DE ALUMNOS: ");
        for(Alumno alumno:alumnos){
            System.out.println(alumno);
        }
    }
}
