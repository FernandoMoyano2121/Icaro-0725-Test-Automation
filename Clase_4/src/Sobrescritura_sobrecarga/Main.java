package Sobrescritura_sobrecarga;

public class Main {
    public static void main(String[] args){
        Perro perro1=new Perro("Max", 4);
        Gato gato1=new Gato("Michi", 2);

        System.out.println("SOBREESCRITURA");
        System.out.println(perro1.comunicarse());
        System.out.println(gato1.comunicarse());
        System.out.println(perro1.toString());

    }
}
