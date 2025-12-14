package excepciones;

public class TipoDeExcepciones {
    public static void main(String[] args){

        //2. NullPointerException
        //intentar usar un objeto que es null
        try{
            String texto=null;
            System.out.println(texto.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException :" + e.getMessage());
        }

        //3. ArrayIndexOutOfBoundException
        //acceder a una posición que no existe en un array
        try{
            int[] numeros ={1,2,3};
            System.out.println(numeros[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException :" + e.getMessage());
        }

        //4. NumberFormatException
        //Intentamos convertir un texto(String) a numero
        try{
         int numero=Integer.parseInt("abc");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException :" + e.getMessage());
        }
    }
}
