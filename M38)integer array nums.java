import java.util.Scanner;

public class Main {
public static int maxSubArray(int[] nums) {
int maxSoFar = nums[0];
int maxEndingHere = nums[0];
for (int i = 1; i < nums.length; i++) {
maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
maxSoFar = Math.max(maxSoFar, maxEndingHere);
}
return maxSoFar;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int size = sc.nextInt();
int[] nums = new int[size];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < size; i++) {
nums[i] = sc.nextInt();
}
int result = maxSubArray(nums);
System.out.println("The maximum sum of the subarray is: " + result);
}
}
