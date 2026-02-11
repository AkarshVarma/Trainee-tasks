abstract class Vehicle {
    abstract double rent();
}

class Car extends Vehicle {
    double rent() { return 1000; }
}

class Bike extends Vehicle {
    double rent() { return 500; }
}

public class RentalApp {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println("Rent: " + v.rent());
    }
}
