package ExcepcionesPersonalizadas;

public class EdadInvalidaException extends Exception {

    //Constructor
    public EdadInvalidaException(String message) {
        super(message);
    }

    //Constructor con mensaje y causa
    public EdadInvalidaException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
