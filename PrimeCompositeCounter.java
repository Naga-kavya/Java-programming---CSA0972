import java.util.Scanner;

public class PrimeCompositeCounter {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num, primeCount = 0, compositeCount = 0;

      while (true) {
         System.out.print("Enter a number (0 to exit): ");
         try {
            num = sc.nextInt();
            if (num == 0) {
               break;
            }

            if (isPrime(num)) {
               primeCount++;
            } else {
               compositeCount++;
            }
         } catch (Exception e) {
            System.out.println("Invalid input. Enter a valid integer.");
            sc.nextLine();
         }
      }
      System.out.println("Total prime numbers: " + primeCount);
      System.out.println("Total composite numbers: " + compositeCount);
   }

   public static boolean isPrime(int n) {
      if (n <= 1) {
         return false;
      }
      for (int i = 2; i < n; i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
   }
}
