import java.util.concurrent.*;

public class ScheduledDemo {
    public static void main(String[] args) throws Exception {

        ScheduledExecutorService ex =
                Executors.newScheduledThreadPool(1);

        Runnable task = () ->
                System.out.println("Cleanup Running");

        ex.scheduleAtFixedRate(task, 0, 3,
                TimeUnit.SECONDS);

        Thread.sleep(10000);
        ex.shutdown();
    }
}
