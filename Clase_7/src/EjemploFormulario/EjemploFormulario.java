package EjemploFormulario;

import java.util.Scanner;

public class EjemploFormulario {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String nombre="";
        int edad=0;
        boolean datosValidos = false;

        //Solicitar el nombre
        while(nombre.trim().isEmpty()){
            System.out.println("Ingrese su nombre: ");
            nombre= scanner.nextLine();

            if(nombre.trim().isEmpty()){
                System.out.println("El nombre no puede estár vacio, Intentalo nuevamente \n");
            }
        }

        while(!datosValidos){
            System.out.println("Ingresa tu edad");
            try{
                edad=Integer.parseInt(scanner.nextLine());

                if(edad < 0 || edad > 120){
                    System.out.println("Edad invalida, Debe estár entre 0 y 120. \n");
                }else{
                    datosValidos=true;
                }

            }catch(NumberFormatException e){
                System.out.println("Debe Ingresar un numero válido. Intente nuevamente");
            }finally {
                System.out.println("Este bloque se ejecuta siempre");
            }

        }

        System.out.println("\n Registro exitoso!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}
