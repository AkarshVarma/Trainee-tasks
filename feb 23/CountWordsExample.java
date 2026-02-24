import java.io.*;

public class CountWordsExample {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int wordCount = 0;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            wordCount += words.length;
        }

        reader.close();
        System.out.println("Total Words: " + wordCount);
    }
}