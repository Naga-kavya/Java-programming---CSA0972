import java.util.Scanner;

public class SpecialCharacterCount {
  
  public static int countSpecialCharacters(String statement) {
    int count = 0;
    for (int i = 0; i < statement.length(); i++) {
      char c = statement.charAt(i);
      if (!Character.isLetterOrDigit(c)) {
        count++;
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Given statement: ");
    String statement = sc.nextLine();
    int count = countSpecialCharacters(statement);
    System.out.println("Number of special Characters: " + count);
  }
}
