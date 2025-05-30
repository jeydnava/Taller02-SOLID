package example;

public class IvaCalculator {
    public double calculateIVA(Product p) {
        double iva = 0;
        switch (p.getType()) {
            case "book":
                iva = 0;
                break;
            case "clothing":
                iva = p.getPrice() * 0.12;
                break;
            case "technology":
                iva = p.getPrice() * 0.15;
                break;
        }
        return iva;
    }
}
