package Interfaces;

public class Ventilador implements Encendible{
    private String ubicacion;
    private boolean encendido;

    public Ventilador(String ubicacion){
        this.ubicacion=ubicacion;
        this.encendido=false;
    }

    @Override
    public void encender(){
        this.encendido=true;
        System.out.println( "🌀Ventilador de " + ubicacion + " encendido - Girando aspas...");
    }

    @Override
    public void apagar(){
        this.encendido=false;
        System.out.println("🌀 Ventilador de " + ubicacion + " apagado");
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public boolean isEncendido(){return encendido;}

}
