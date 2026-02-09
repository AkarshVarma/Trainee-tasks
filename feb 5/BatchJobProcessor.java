public class BatchJobProcessor {
    public static void main(String[] args) {
        int[] records = {100, 200, -1, 300, 999, 400, 500};

        System.out.println("Starting batch job...\n");
        for (int i = 0; i < records.length; i++) {
            if (records[i] == 999) {
                System.out.println("CRITICAL ERROR at record " + (i + 1));
                System.out.println("Stopping batch job!");
                break;
            }
            if (records[i] < 0) {
                System.out.println("Skipping invalid record at position " + (i + 1));
                continue;
            }
            System.out.println("Processing record " + (i + 1) +
                               " with value: " + records[i]);
        }

        System.out.println("\nBatch job ended.");
    }
}
