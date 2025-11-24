public class Main {
    public static void main(){
//        Estudiante estudiante1= new Estudiante(1001, "María González", 8.5f);
//        System.out.println("ID: " + estudiante1.getId());
//        System.out.println("Nombre Completo:  " + estudiante1.getNombreCompleto());
//        estudiante1.setPromedio(9.5f);
//        System.out.println("Promedio:  " + estudiante1.getPromedio());

        Alumno alumno1=new Alumno("Az-1032", "Juan","Garcia");

        alumno1.agregarMateria("Fisica");
        alumno1.agregarMateria("Inglés");

        System.out.println("Materias : " + alumno1.getMaterias());
    }
}
