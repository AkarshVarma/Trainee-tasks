public class ServerLoadMonitoring {
    public static void main(String[] args) {
        int[] cpuLoad = {65, 70, 44, 85, 69, 75, 90};
        int highest = cpuLoad[0];
        int lowest = cpuLoad[0];
        int sum = 0;
        for (int load : cpuLoad) {
            if (load > highest) {
                highest = load;
            }
            if (load < lowest) {
                lowest = load;
            }
            sum += load;
        }
        double average = (double) sum / cpuLoad.length;
        System.out.println("Highest CPU Load: " + highest + "%");
        System.out.println("Lowest CPU Load: " + lowest + "%");
        System.out.println("Average CPU Load: " + average + "%");
    }
}