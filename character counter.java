import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int numberCount = 0;

        System.out.println("Enter * to exit...");

        while (true) {
            System.out.print("Enter any character: ");
            try {
                char c = sc.next().charAt(0);
                if (c == '*') {
                    break;
                }
                if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else if (Character.isUpperCase(c)) {
                    upperCaseCount++;
                } else if (Character.isDigit(c)) {
                    numberCount++;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid character.");
            }
        }

        System.out.println("Total count of lower case: " + lowerCaseCount);
        System.out.println("Total count of upper case: " + upperCaseCount);
        System.out.println("Total count of numbers: " + numberCount);
        sc.close();
    }
}
