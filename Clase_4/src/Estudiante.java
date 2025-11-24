public class Estudiante {
    private Integer id;
    private String nombreCompleto;
    private Float promedio;

    //public Estudiante(){}

    public Estudiante(Integer id, String nombreCompleto, Float promedio){
        this.id=id;
        this.nombreCompleto=nombreCompleto;
        this.promedio=promedio;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }

    public Float getPromedio(){
        return promedio;
    }

    public void setPromedio(Float promedio){
        this.promedio=promedio;
    }
}
