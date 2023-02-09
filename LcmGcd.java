import java.util.Scanner;

public class LcmGcd {

  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of integers: ");
    int n = sc.nextInt();

    int[] numbers = new int[n];
    System.out.print("Enter " + n + " integers: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextInt();
    }

    int gcd = numbers[0];
    int lcm = numbers[0];
    for (int i = 1; i < n; i++) {
      gcd = gcd(gcd, numbers[i]);
      lcm = lcm(lcm, numbers[i]);
    }

    System.out.println("The GCD of the numbers is: " + gcd);
    System.out.println("The LCM of the numbers is: " + lcm);
  }
}
