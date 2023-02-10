import java.util.Scanner;

public class Factors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Given Number: ");
    int number = sc.nextInt();
    System.out.print("N: ");
    int n = sc.nextInt();
    int factors = 0;
    int i;
    for (i = 1; i <= number; i++) {
      if (number % i == 0) {
        factors++;
      }
    }
    System.out.println("Number of factors = " + factors);
    int count = 0;
    for (i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
        if (count == n) {
          System.out.println(n + "th factor of " + number + " = " + i);
          break;
        }
      }
    }
  }
}
