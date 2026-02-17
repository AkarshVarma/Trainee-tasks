class Report extends Thread {
    String name;
    Report(String name) { this.name = name; }

    public void run() {
        System.out.println(name + " Generated");
    }
}

public class ReportSystem {
    public static void main(String[] args) throws Exception {
        Report r1 = new Report("Sales");
        Report r2 = new Report("Inventory");

        r1.start();
        r2.start();

        r1.join();
        r2.join();

        System.out.println("All Reports Completed");
    }
}
