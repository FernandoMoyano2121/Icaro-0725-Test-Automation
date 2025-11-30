package Práctica_5;

public class NoDocente extends Persona {
    private String area;

    public NoDocente() {
        super();
    }

    public NoDocente(String nombre, String apellido, String area) {
        super(nombre, apellido);
        this.area = area;
    }

    // SOBRESCRITURA del metodo saludar
    @Override
    public void saludar() {
        System.out.println("Buen día");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}