package Práctica_4;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String matricula;
    private Integer nota;
    private ArrayList<String> materias;


    public Alumno(String matricula, String nombre, String apellido){
        super(nombre, apellido);
        this.matricula = matricula;
        this.nota = 0;
        this.materias = new ArrayList<>();
    }

    @Override
    public void saludar(){
        System.out.println("Hola como andás?");
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public ArrayList<String> getMaterias(){
        return materias;
    }

    public void setMaterias(ArrayList<String> materias){
        this.materias=materias;
    }

    public void agregarMateria(String materia){
        this.materias.add(materia);
    }

//    @Override
//    public String toString(){
//        return getNombre() + " " + getApellido() + "Notas: " + nota;
//    }


    @Override
    public String toString(){
        return getNombre() + " " + getApellido() + "Notas: " + nota;
    }
}
