package excepciones;

public class ErrorEjecucion {
    public static void main(String[] args){
        int a = 10;
        int b = 0;

        int resultado = a/b; //✅Compila, pero Falla al ejecutarse
        System.out.println(resultado);
    }
}
