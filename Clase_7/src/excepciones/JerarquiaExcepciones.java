package excepciones;

public class JerarquiaExcepciones {
    public static void main(String[] args){
        //OPCION 1 : Capturar especificamente
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Capturé específicamente ArithmeticException");
        }

        //OPCION 2 : Capturar de forma más genérica
        try {
            int resultado = 10 / 0;
        } catch (RuntimeException e) {
            System.out.println("Capturé RuntimeException (padre de ArithmeticException)");
        }

        //OPCION 3 : Capturar especificamente
        try {
            int resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Capturé Exception (captura cualquier excepcion");
        }

        //Mutiples catches( de más especifico a más genérico )
        try{
            String texto=null;
            System.out.println(texto.length());
        }catch(NullPointerException e){
            System.out.println("Es NullPointerException");
        }catch(RuntimeException e){
            System.out.println("Es alguna RuntimeException");
        }catch(Exception e){
            System.out.println("Es alguna otra Exception");
        }
    }
}
