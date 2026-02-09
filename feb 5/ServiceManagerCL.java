import java.util.Scanner;

public class ServiceManagerCL {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
           
            System.out.println("\n--- Service Manager ---");
            System.out.println("1. Start Service");
            System.out.println("2. Stop Service");
            System.out.println("3. Restart Service");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

          
            switch (choice) {
                case 1:
                    System.out.println("Service started successfully.");
                    break;

                case 2:
                    System.out.println("Service stopped successfully.");
                    break;

                case 3:
                    System.out.println("Service restarted successfully.");
                    break;

                case 4:
                    System.out.println("Exiting Service Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
