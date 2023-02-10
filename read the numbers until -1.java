import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        double positiveSum = 0;
        double negativeSum = 0;

        System.out.println("Enter -1 to exit...");
        while (input != -1) {
            System.out.print("Enter the number: ");
            try {
                input = sc.nextInt();
                if (input > 0) {
                    positiveCount++;
                    positiveSum += input;
                } else if (input < 0) {
                    negativeCount++;
                    negativeSum += input;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        double positiveAverage = positiveSum / positiveCount;
        double negativeAverage = negativeSum / negativeCount;

        System.out.println("The average of positive numbers is: " + positiveAverage);
        System.out.println("The average of negative numbers is: " + negativeAverage);

        sc.close();
    }
}
