import java.io.*;

public class CountLinesExample {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int count = 0;

        while ((line = reader.readLine()) != null) {
            count++;
        }

        reader.close();
        System.out.println("Total Lines: " + count);
    }
} 
