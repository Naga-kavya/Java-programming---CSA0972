import java.util.Scanner;

public class Permutations {
  public static void permute(int[] arr, int index) {
    if (index == arr.length) {
      for (int i : arr) {
        System.out.print(i);
      }
      System.out.println();
    } else {
      for (int i = index; i < arr.length; i++) {
        swap(arr, index, i);
        permute(arr, index + 1);
        swap(arr, index, i);
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Given Number: ");
    int num = sc.nextInt();
    int[] arr = Integer.toString(num).chars().map(c -> c - '0').toArray();
    System.out.println("Permutations are:");
    permute(arr, 0);
  }
}
