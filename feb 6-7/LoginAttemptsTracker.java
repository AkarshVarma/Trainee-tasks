public class LoginAttemptsTracker {
    public static void main(String[] args) {
        int[] attempts = {10, 40, 60, 70, 30};
        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] > 30) {
                System.out.println("Alert: User " + (i + 1) +
                                   " has failed login attempts = " + attempts[i]);
            }
        }
    }
}
