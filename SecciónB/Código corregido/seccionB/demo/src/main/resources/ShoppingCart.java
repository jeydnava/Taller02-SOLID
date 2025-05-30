package fww;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        // Lógica para calcular el precio total
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void sendReceipt() {
        System.out.println("Sending receipt by email...");
        // Lógica para enviar el recibo
        // This could involve sending an actual email, saving to a database, etc.
    }
}
