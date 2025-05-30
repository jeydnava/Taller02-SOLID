package Corrrecion;

public class CreadorFactura implements EmisorFactura {
    @Override
    public void emitirFactura() {
        // Lógica para crear la factura
        System.out.println("Factura emitida.");
    }
}
