package fww;

public class TecnologiaFisica extends Product implements ProductoFisico {
    private double weight;

    public TecnologiaFisica(String nombre, double precio, double weight) {
        super(nombre,precio);
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
        return getPrice() * 0.15;
    }
    
}
