import java.util.*;

public class PalindromePartition {
    static int minCut(String str) {
        int n = str.length();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(j) == str.charAt(i) && (j + 1 > i - 1 || dp[j + 1] < min)) {
                    min = dp[j + 1];
                }
            }
            dp[i + 1] = min + 1;
        }
        return dp[n] - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int result = minCut(str);
        System.out.println("The minimum number of cuts needed for a palindrome partitioning of the string is: " + result);
    }
}
