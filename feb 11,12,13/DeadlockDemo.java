public class DeadlockDemo {
    static final Object A = new Object();
    static final Object B = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized(A) {
                synchronized(B) {
                    System.out.println("Thread1 done");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(B) {
                synchronized(A) {
                    System.out.println("Thread2 done");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
