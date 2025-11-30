package Práctica_4;
import java.util.ArrayList;

// CLASE HIJA: ALUMNO
public class Alumno extends Persona {
    private String matricula;
    private Integer nota;
    private ArrayList<String> materias;


    // Constructor completo
    public Alumno(String nombre, String apellido, String matricula) {
        super(nombre, apellido); // Llama al constructor del padre
        this.matricula = matricula;
        this.nota = 0;
        this.materias = new ArrayList<>();
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    //Metodo para agregar una materia
    public void agregarMateria(String materia) {
        this.materias.add(materia);
    }
}
