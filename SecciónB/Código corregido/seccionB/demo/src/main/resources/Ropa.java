package fww;

public class Ropa extends Product implements ProductoFisico {
    private double weight;

    public Ropa(String nombre, double precio, double weight) {
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
        return this.getPrice() * 0.15; //IVA CON 15%
    }
}
