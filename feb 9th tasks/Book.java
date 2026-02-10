public class Book {

    public static void main(String[] args) {
        boolean isIssued = false;

        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued");
        }

        isIssued = false;
        System.out.println("Book returned");
    }
}
