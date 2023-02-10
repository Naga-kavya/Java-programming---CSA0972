import java.util.Scanner;

public class ExceptionHandling {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the divisor: ");
    int divisor = sc.nextInt();
    try {
      for (int i = 0; i <= n; i++) {
        System.out.println(arr[i] / divisor);
      }
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
      System.out.println("Caught Exception: " + e);
    }
    System.out.println("Program Terminated");
  }
}
