package Práctica_5;


// CLASE PADRE PERSONA (con metodo saludar)
public class Persona {
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodo que será sobrescrito por las clases hijas
    public void saludar() {
        System.out.println("Hola, ¿cómo están?");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}