public class MissingNumber {
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};

        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += a[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
