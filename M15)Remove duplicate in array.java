import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
  
  public static Integer[] removeDuplicates(Integer[] array) {
    Set<Integer> set = new HashSet<>(Arrays.asList(array));
    return set.toArray(new Integer[0]);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in array: ");
    int n = sc.nextInt();
    Integer[] array = new Integer[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter element" + (i + 1) + ": ");
      array[i] = sc.nextInt();
    }
    Integer[] result = removeDuplicates(array);
    System.out.println("Non-duplicate items:");
    System.out.println(Arrays.toString(result));
  }
}
