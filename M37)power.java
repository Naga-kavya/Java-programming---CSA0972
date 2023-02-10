import java.util.Scanner;

public class Power {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double result = 1;
        double current = x;
        for (int i = n; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result = result * current;
            }
            current = current * current;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(x + " raised to the power of " + n + " is " + pow(x, n));
    }
}
