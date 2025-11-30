package Práctica_4;

// CLASE HIJA: NODOCENTE
public class NoDocente extends Persona {
    private String area;


    // Constructor completo
    public NoDocente(String nombre, String apellido, String area) {
        super(nombre, apellido);
        this.area = area;
    }

    // Getters y Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
