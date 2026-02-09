public class DataSyncValidation {
    public static void main(String[] args) {

        int[] source = {10, 20, 30, 40, 50};
        int[] destination = {10, 25, 30, 45, 50};

        boolean isIdentical = true;

        if (source.length != destination.length) {
            System.out.println("Arrays are not identical (different lengths).");
            return;
        }

        System.out.println("Mismatched Indexes:");

        for (int i = 0; i < source.length; i++) {
            if (source[i] != destination[i]) {
                System.out.println("Index " + i +
                        " -> Source: " + source[i] +
                        ", Destination: " + destination[i]);
                isIdentical = false;
            }
        }

        if (isIdentical) {
            System.out.println("Arrays are identical.");
        }
    }
}
