public class StudentMarksValidation {
    public static void main(String[] args) {

        // Sample marks array
        int[] marks = {85, 67, -5, 102, 45, 90, 33, 76};

        int passCount = 0;
        int failCount = 0;

        System.out.println("Invalid Marks:");

        for (int mark : marks) {

            // Check invalid marks
            if (mark < 0 || mark > 100) {
                System.out.println(mark);
                continue;
            }

            // Check pass/fail (Pass if >= 35)
            if (mark >= 35) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("\nPass Students: " + passCount);
        System.out.println("Fail Students: " + failCount);
    }
}
