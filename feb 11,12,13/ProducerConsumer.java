import java.util.concurrent.*;

public class ProducerConsumer {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue =
                new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            try {
                queue.put(1);
                System.out.println("Produced");
            } catch(Exception e){}
        };

        Runnable consumer = () -> {
            try {
                queue.take();
                System.out.println("Consumed");
            } catch(Exception e){}
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
