class Account {
    int balance = 1000;

    synchronized void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + " Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankSync {
    public static void main(String[] args) {
        Account acc = new Account();

        Runnable r = () -> acc.withdraw(700);

        new Thread(r).start();
        new Thread(r).start();
    }
}
