import java.util.*;

abstract class BankAccount {
    protected double balance;
    int accNo;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    abstract void withdraw(double amt);

    void show() {
        System.out.println("AccNo: " + accNo + " Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int a, double b) { super(a,b); }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("No overdraft in Savings!");
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int a, double b) { super(a,b); }

    void withdraw(double amt) {
        balance -= amt; // overdraft allowed
    }
}

public class BankingApp {
    public static void main(String[] args) {
        HashMap<Integer, BankAccount> map = new HashMap<>();

        map.put(1, new SavingsAccount(1,1000));
        map.put(2, new CurrentAccount(2,500));

        map.get(1).withdraw(1200);
        map.get(2).withdraw(1200);

        map.get(1).show();
        map.get(2).show();
    }
}
