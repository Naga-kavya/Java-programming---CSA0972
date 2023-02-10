import java.util.Scanner;

public class PerfectNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int count = 0;
    int number = 1;
    
    try {
      System.out.print("Enter the value of n: ");
      n = sc.nextInt();
      
      while (count < n) {
        if (isPerfect(number)) {
          System.out.println(number + " is a perfect number.");
          count++;
        }
        number++;
      }
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter an integer.");
    }
  }
  
  static boolean isPerfect(int num) {
    int sum = 0;
    
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    
    return sum == num;
  }
}
