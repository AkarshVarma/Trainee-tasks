class Theatre {
    int seats = 5;

    synchronized void bookSeat() {
        if (seats > 0) {
            seats--;
            System.out.println("Seat booked. Left: " + seats);
        } else {
            System.out.println("Housefull!");
        }
    }
}

public class MovieApp {
    public static void main(String[] args) {
        Theatre t = new Theatre();

        Runnable r = () -> t.bookSeat();

        new Thread(r).start();
        new Thread(r).start();
    }
}
