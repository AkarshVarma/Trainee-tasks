class Order implements Runnable {
    int id;
    Order(int id) { this.id = id; }

    public void run() {
        System.out.println("Order " + id + " Validated");
        System.out.println("Order " + id + " Payment Done");
        System.out.println("Order " + id + " Completed");
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(new Order(i));
            t.start();
        }
    }
}
