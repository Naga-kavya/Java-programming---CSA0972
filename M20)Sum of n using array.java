import java.util.Scanner;

public class SumOfN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter " + n + " numbers: ");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
      if (i >= n) {
        throw new ArrayIndexOutOfBoundsException("Index out of bounds");
      }
      sum += nums[i];
    }
    System.out.println("The sum of " + n + " numbers is: " + sum);
  }
}
