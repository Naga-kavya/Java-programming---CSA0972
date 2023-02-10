import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int m, n, sum, diff;

    System.out.print("Enter the number of elements in the array: ");
    int size = 0;
    try {
      size = scan.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter an integer.");
      System.exit(1);
    }

    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      try {
        arr[i] = scan.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter an integer.");
        System.exit(1);
      }
    }

    System.out.print("Enter the value of m: ");
    try {
      m = scan.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter an integer.");
      System.exit(1);
    }

    System.out.print("Enter the value of n: ");
    try {
      n = scan.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter an integer.");
      System.exit(1);
    }

    Arrays.sort(arr);
    m = size - m;
    sum = arr[m] + arr[n - 1];
    diff = arr[m] - arr[n - 1];

    System.out.println("The " + m + "th maximum number is: " + arr[m]);
    System.out.println("The " + n + "th minimum number is: " + arr[n - 1]);
    System.out.println("The sum of the " + m + "th maximum and " + n + "th minimum numbers is: " + sum);
    System.out.println("The difference of the " + m + "th maximum and " + n + "th minimum numbers is: " + diff);
  }
}
