package Sobreescritura_Sobrecarga;

public class Main {
    public static void main(String[] args) {

        // Crear objetos
        Perro perro1 = new Perro("Max", 3);
        Gato gato1 = new Gato("Michi", 2);

        // Demostración de sobrescritura
        System.out.println("===== SOBRESCRITURA =====");

        System.out.println("Llamado:");
        System.out.println("System.out.println(perro1.comunicarse());");
        System.out.println("\nSalida:");
        System.out.println(perro1.comunicarse());

        System.out.println("\nLlamado:");
        System.out.println("System.out.println(gato1.comunicarse());");
        System.out.println("\nSalida:");
        System.out.println(gato1.comunicarse());


        //toString() llamado directamente
        System.out.println("\n2. Llamando explícitamente a toString():");
        System.out.println("   System.out.println(perro.toString());");
        System.out.println("   Resultado: " + perro1.toString());

    }
}


//**Salida del Programa:**
//
//        ===== SOBRESCRITURA =====
//Llamado:
//        System.out.println(perro1.comunicarse());
//
//Salida:
//Ladrando...
//
//Llamado:
//        System.out.println(gato1.comunicarse());
//
//Salida:
//Maullando
