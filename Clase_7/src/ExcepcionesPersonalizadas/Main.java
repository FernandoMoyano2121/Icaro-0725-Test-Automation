package ExcepcionesPersonalizadas;

public class Main {
    public static void main(String[] args) {

        // Caso exitoso
        try{
            Persona persona1 = new Persona("Juan", 130);
            System.out.println("✅ Persona creada: " + persona1.getNombre() +
                    ", edad: " + persona1.getEdad());
        }catch(EdadInvalidaException e){
            System.out.println("Error :" + e.getMessage());
        }

        // Caso con excepción (edad negativa)
        try {
            Persona persona2 = new Persona("María", -5);
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

    }
}
