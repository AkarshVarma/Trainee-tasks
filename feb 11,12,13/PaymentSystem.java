class Payment extends Thread {
    public void run() {
        try {
            Thread.sleep((int)(Math.random()*2000));
        } catch (Exception e) {}
        System.out.println("Payment Completed by " + getName());
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
            new Payment().start();
    }
}
