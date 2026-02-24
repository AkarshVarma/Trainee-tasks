import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"));

            writer.write("Line 1\n");
            writer.write("Line 2\n");
            writer.write("Line 3\n");
            writer.write("Line 4\n");
            writer.write("Line 5\n");

            writer.close();
            System.out.println("Data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}