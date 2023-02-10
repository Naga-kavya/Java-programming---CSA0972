import java.util.ArrayList;
import java.util.Scanner;

public class ArrayWithFirstAndSecondElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lower range: ");
    int lower = sc.nextInt();
    System.out.print("Enter the upper range: ");
    int upper = sc.nextInt();
    ArrayList<int[]> arr = new ArrayList<>();
    for (int i = lower; i <= upper; i++) {
      arr.add(new int[]{i, i * i});
    }
    System.out.println(arr);
  }
}
