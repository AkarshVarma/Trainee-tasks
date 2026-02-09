public class SystemHealthCheck {
    public static void main(String[] args) {
        double totalCpu = 100.0;      
        double usedCpu = 72.5;        

        double totalMemory = 16000;   
        double usedMemory = 13000;    

        double cpuUsagePercent = (usedCpu / totalCpu) * 100;
        double memoryUsagePercent = (usedMemory / totalMemory) * 100;

        System.out.println("CPU Usage: " + cpuUsagePercent + "%");
        System.out.println("Memory Usage: " + memoryUsagePercent + "%");

 
        String systemHealth =
                (cpuUsagePercent < 80 && memoryUsagePercent < 80)
                ? "HEALTHY"
                : "CRITICAL";

        System.out.println("System Health Status: " + systemHealth);
    }
}


        
