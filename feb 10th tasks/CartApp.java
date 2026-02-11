import java.util.*;

interface Product {
    double getPrice();
}

class Electronics implements Product {
    public double getPrice() { return 2000; }
}

class Clothing implements Product {
    public double getPrice() { return 1000; }
}

public class CartApp {
    public static void main(String[] args) {
        List<Product> cart = Arrays.asList(new Electronics(), new Clothing());

        double total = cart.stream()
                           .mapToDouble(Product::getPrice)
                           .sum();

        System.out.println("Total Price: " + total);
    }
}
