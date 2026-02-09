public class ServerDowntimeChecker {
    public static void main(String[] args) {
        int[] serverStatus = {1, 0, 0, 1, 0, 0, 0, 1, 0};
        int totalDowntime = 0;
        int currentStreak = 0;
        int maxStreak = 0;
        for (int status : serverStatus) {
            if (status == 0) {
                totalDowntime++;
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Total Downtime Hours: " + totalDowntime);
        System.out.println("Longest Continuous Downtime: " + maxStreak + " hours");
    }
}
