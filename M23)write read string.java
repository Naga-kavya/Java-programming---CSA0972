import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
   public static void main(String[] args) {
      try {
         FileWriter writer = new FileWriter("textfile.txt");
         writer.write("Computer Science and Engineering");
         writer.close();
         System.out.println("Text written to file successfully.");
      } catch (IOException e) {
         System.out.println("An error occurred while writing to file.");
         e.printStackTrace();
      }

      try {
         FileReader reader = new FileReader("textfile.txt");
         int i;
         while ((i = reader.read()) != -1) {
            System.out.print((char) i);
         }
         reader.close();
      } catch (IOException e) {
         System.out.println("An error occurred while reading from file.");
         e.printStackTrace();
      }
   }
}
