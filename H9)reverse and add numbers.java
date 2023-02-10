import java.util.Scanner;

public class ReverseAndAdd {
  public static boolean isPalindrome(int num) {
    int reverse = 0;
    int n = num;
    while (n != 0) {
      reverse = reverse * 10 + n % 10;
      n /= 10;
    }
    return reverse == num;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int iteration = 0;
    while (!isPalindrome(num)) {
      int reverse = 0;
      int n = num;
      while (n != 0) {
        reverse = reverse * 10 + n % 10;
        n /= 10;
      }
      num += reverse;
      iteration++;
    }
    System.out.println("Number of iterations: " + iteration);
    System.out.println("Palindrome: " + num);
  }
}
