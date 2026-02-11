class Book {
    boolean issued = false;

    void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Not available");
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Book b = new Book();
        b.issue();
        b.issue();
    }
}
