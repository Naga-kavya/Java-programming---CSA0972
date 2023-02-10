import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "Welcome to Saveetha University";
    System.out.println("Original String: " + str);
    
    // Replacing a word in the string
    str = str.replace("Saveetha", "OpenAI");
    System.out.println("After replacing the word: " + str);
    
    // Finding the length of the string
    int length = str.length();
    System.out.println("Length of the string: " + length);
    
    // Converting the string to uppercase
    str = str.toUpperCase();
    System.out.println("String in uppercase: " + str);
  }
}
