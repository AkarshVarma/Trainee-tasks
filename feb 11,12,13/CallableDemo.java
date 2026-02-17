import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 100 * 10 / 100;

        Future<Integer> result = ex.submit(task);

        System.out.println("Interest: " + result.get());

        ex.shutdown();
    }
}
