package Sobreescritura_Sobrecarga;

public class Gato extends Animal {

    // Constructor vacío
    public Gato() {
        super();
    }

    // Constructor con parámetros
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescritura del método comunicarse()
    @Override
    public String comunicarse() {
        return "Maullando...";
    }
}