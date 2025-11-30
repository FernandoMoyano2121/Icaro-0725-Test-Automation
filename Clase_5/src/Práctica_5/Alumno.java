
package Práctica_5;
import java.util.ArrayList;

// CLASE ALUMNO (con sobrescritura de saludar)
public class Alumno extends Persona {
    private String matricula;
    private Integer nota;
    private ArrayList<String> materias;

    public Alumno() {
        super();
        this.materias = new ArrayList<>();
        this.nota = 0;
    }

    public Alumno(String nombre, String apellido, String matricula) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.nota = 0;
        this.materias = new ArrayList<>();
    }

    // SOBRESCRITURA del metodo saludar
    @Override
    public void saludar() {
        System.out.println("¡Qué onda!");
    }

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

    public void agregarMateria(String materia) {
        this.materias.add(materia);
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido() + " (Matrícula: " + matricula + ", Nota: " + nota + ")";
    }
}
