package Base;

public class PagoPayPal extends Pago {
    private boolean loggedIn; // conexión a cuenta PayPal

    @Override
    public void realizarCobro(double monto) {
        if (!loggedIn) {
            // loggear();
            return;
        }
        // cargar el monto de compra al medio de pago
    }
}
