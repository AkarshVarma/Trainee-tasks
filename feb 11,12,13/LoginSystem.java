class Login extends Thread {
    public void run() {
        System.out.println(getName() + " Login Started");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println(getName() + " Login Success");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Login t = new Login();
            System.out.println("State before: " + t.getState());
            t.start();
            System.out.println("State after: " + t.getState());
        }
    }
}
