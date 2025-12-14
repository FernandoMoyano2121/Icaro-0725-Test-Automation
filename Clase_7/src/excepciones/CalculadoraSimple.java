package excepciones;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1=scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2=scanner.nextInt();

        try{
            int resultado=num1/num2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("❌ ERROR: No se puede dividir por cero");
            System.out.println("por favor, intente con otro número");

        }

        System.out.println("Gracias por usar la calculadora");
        scanner.close();
    }
}
