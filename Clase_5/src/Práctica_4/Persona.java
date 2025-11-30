package Práctica_4;

public class Persona {
    private String nombre;
    private String apellido;


    // Constructor completo
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
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


//CUANDO conviene que Persona sea abstracta
//1. Cuando no tiene sentido crear una persona genérica
//2. Cuando querés obligar a las clases hijas a implementar métodos
//3. Cuando Persona es solo un molde común


//CUANDO usariamos Persona sin ser Abstracta
//Por ejemplo, si quisieras:
//
//una agenda de personas (sin importar el rol)
//
//una función que recibe una Persona pero no le importa si es Alumno o Profesor
//
//almacenar todas las personas en un mismo ArrayList<Persona>



//ArrayList<Persona> personas = new ArrayList<>();
//
//personas.add(new Alumno("Juan", "Pérez", "A-1"));
//personas.add(new Profesor("Ana", "Martínez"));
//personas.add(new NoDocente("Carlos", "López", "Administración"));
//personas.add(new Persona("Laura", "Gómez")); // Esto también es válido
//
//for (Persona p : personas) {
//    System.out.println(p.getNombre() + " " + p.getApellido());
//}