package fww;

public class LibroDigital extends Product implements DigitalProduct{

    public LibroDigital (String nombre, double precio) {
        super(nombre, precio);
    }

    public double calcularIVA() {
        return 0; //Libros no aplican para IVA
    }

}
