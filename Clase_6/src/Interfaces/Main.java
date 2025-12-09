package Interfaces;

public class Main {
    public static void main(String[]args){
        //crear dispositivos
        Luz luzSala=new Luz("Sala");
        Luz luzCocina=new Luz("Cocina");
        Ventilador ventiladorDormitorio=new Ventilador("Dormitorio");

        Encendible[] dispositivos={luzCocina, luzSala, ventiladorDormitorio};

        System.out.println("ENCENDIENDO TODOS LOS DISPOSITIVOS");
        for(Encendible dispositivo : dispositivos){
            dispositivo.encender();
        }
        System.out.println();
    }
}
