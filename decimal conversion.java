import java.util.Scanner;

public class DecimalConversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int decimal = 0;
    
    try {
      System.out.print("Enter a decimal number: ");
      decimal = sc.nextInt();
      System.out.println("Binary equivalent: " + Integer.toBinaryString(decimal));
      System.out.println("Octal equivalent: " + Integer.toOctalString(decimal));
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter an integer.");
    }
  }
}
