class Doctor {
    String name = "Dr. Akarsh";
}

class Patient {
    String name = "AKU";
}

public class HospitalApp {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Patient p = new Patient();

        System.out.println(p.name + " assigned to " + d.name);
    }
}
