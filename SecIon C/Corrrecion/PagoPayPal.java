package Corrrecion;
public class PagoPayPal implements MetodoDePago {

    @Override
    public void ejecutarPago(double cantidad) {
        // Lógica de pago con  PayPal
        System.out.println("Pago realizado vía Pasarela PayPal por valor de: " + cantidad);
    }
}