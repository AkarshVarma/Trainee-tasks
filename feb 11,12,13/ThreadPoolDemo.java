import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int id = i;
            ex.execute(() -> {
                System.out.println("Task " + id +
                        " by " + Thread.currentThread().getName());
            });
        }

        ex.shutdown();
    }
}
