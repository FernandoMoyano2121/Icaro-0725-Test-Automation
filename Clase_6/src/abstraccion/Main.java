package abstraccion;

public class Main {
    public static void main(String[] args){
      Pago pago1 = new PagoTarjeta(300.00,"2025-12-25","1233-1231-1231-2131","123");
      Pago pago2 = new PagoTransferencia(300.00, "2024-11-28", "0001234567890");

      pago1.procesarPago();
      System.out.println();
      pago2.procesarPago();

    }
}
