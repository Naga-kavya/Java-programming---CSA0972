import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);

            int wordCount = 0;
            int characterCount = 0;
            int lineCount = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;
                wordCount += line.split(" ").length;
                characterCount += line.length();
            }
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + characterCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
