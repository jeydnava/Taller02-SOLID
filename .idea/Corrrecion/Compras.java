package Corrrecion;

public class Compras {
    private MetodoDePago metodoPago;
    private EmisorFactura generadorFactura;
    private CalculadorImpuesto calculadorImpuestos;


    public void procesarOrden(double montoTotal) {
        calculadorImpuestos.determinarImpuesto();
        metodoPago.ejecutarPago(montoTotal);
        generadorFactura.emitirFactura();
    }
}

