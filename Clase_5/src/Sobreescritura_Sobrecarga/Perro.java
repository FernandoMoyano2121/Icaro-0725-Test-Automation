package Sobreescritura_Sobrecarga;

public class Perro extends Animal {

    // Constructor vacío
    public Perro() {
        super();
    }

    // Constructor con parámetros
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescritura del metodo comunicarse()
    @Override
    public String comunicarse() {
        return "Ladrando...";
    }
}