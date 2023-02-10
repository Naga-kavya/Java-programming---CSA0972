import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {14, 67, 48, 23, 5, 62};
    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();
    Arrays.sort(arr);
    int result = arr[arr.length - n];
    System.out.println(n + "th Largest number: " + result);
  }
}
