import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(50);

        int total = 0;
        for (int p : prices)
            total += p;

        System.out.println("Total Bill: " + total);
    }
}
