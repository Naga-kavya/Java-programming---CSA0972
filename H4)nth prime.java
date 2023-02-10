import java.util.Scanner;

public class PrimeNumbers {
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N: ");
    int n = sc.nextInt();
    int count = 0;
    int num = 2;
    while (count < n) {
      if (isPrime(num)) {
        count++;
      }
      num++;
    }
    System.out.println(n + "rd Prime number is " + (num - 1));
    System.out.print(n + " prime numbers after " + (num - 1) + " are: ");
    for (int i = 1; i <= n; i++) {
      System.out.print(num + i - 1 + ", ");
    }
  }
}
