package ExcepcionesPersonalizadas;

public class Persona {
    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadInvalidaException{
        this.nombre = nombre;
        this.edad = edad;
        setEdad(edad);
    }

    public void setEdad(int edad) throws EdadInvalidaException {
        if(edad < 0){
            throw new EdadInvalidaException("La edad no puede ser negativa. Valor recibido : " + edad);
        }
        if(edad > 120){
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años. Valor recibido:" + edad);
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
