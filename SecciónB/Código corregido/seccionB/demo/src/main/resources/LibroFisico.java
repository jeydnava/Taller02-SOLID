package fww;

public class LibroFisico extends Product implements ProductoFisico {
    private double weight;

    public LibroFisico(String nombre, double precio, double weight) {
        super(nombre, precio);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calcularIVA() {
        return 0; //NO APLICA PARA IVA
    }
}
