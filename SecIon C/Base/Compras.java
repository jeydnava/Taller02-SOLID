package Base;

public class Compras {
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private Pago tarjetaCredito;

    public Compras(Pago pago) {
        this.pago = pago;
        // Inicializaciones
    }

    public Compras(PagoPayPal pagoPayPal) {
        this.pagoPayPal = pagoPayPal;
        // Inicializaciones
    }

    public void agregarArticulo(Articulo articulo) {
        // agregar un articulo a la compra
    }

    public void removerArticulo(Articulo articulo) {
        // remover un articulo a la compra
    }
}
