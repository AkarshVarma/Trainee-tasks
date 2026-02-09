import java.util.Scanner;

public class AccessValidation{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasValidID = scanner.nextBoolean();

      
        System.out.print("Do you have an active subscription? (true/false): ");
        boolean hasActiveSubscription = scanner.nextBoolean();

        
        if (age >= 18 && hasValidID && hasActiveSubscription) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        scanner.close();
    }
}