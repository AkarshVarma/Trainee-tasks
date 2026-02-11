import java.util.*;

interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    public double calculateSalary() { return 50000; }
}

class PartTimeEmployee implements Employee {
    public double calculateSalary() { return 20000; }
}

public class PayrollApp {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new FullTimeEmployee(),
                new PartTimeEmployee()
        );

        for (Employee e : list)
            System.out.println(e.calculateSalary());
    }
}
