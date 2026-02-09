public class ApiResponseTimeAnalysis {
    public static void main(String[] args) {

        int[] responseTimes = {1200, 2500, 1800, 3000, 900, 2200};

        int sum = 0;
        int slowCount = 0;

        System.out.println("Slow APIs (>2000 ms):");

        for (int time : responseTimes) {
            sum += time;

            if (time > 2000) {
                System.out.println(time + " ms");
                slowCount++;
            }
        }

        double average = (double) sum / responseTimes.length;

        System.out.println("\nAverage Response Time: " + average + " ms");
        System.out.println("Number of Slow APIs: " + slowCount);
    }
}
