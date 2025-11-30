package Práctica_4;

public class NoDocente extends Persona {
    private String area;

    public NoDocente(String nombre, String apellido, String area){
        super(nombre, apellido);
        this.area=area;
    }

    @Override
    public void saludar(){
        System.out.println("Buen Dia! ");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
