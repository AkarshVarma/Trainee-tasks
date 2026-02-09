public class SalaryIncrementCalculator {
    public static void main(String[] args) {
        double[] salaries = {25000, 30000, 40000, 50000};
        System.out.println("Updated Salaries:");
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] + (salaries[i] * 0.10);
            System.out.println("Employee " + (i + 1) + ": " + salaries[i]);
        }
    }
}
