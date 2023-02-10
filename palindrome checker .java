import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean validChoice = false;
        
        while (!validChoice) {
            System.out.println("Choose an option: ");
            System.out.println("1. Check if a given string is a palindrome.");
            System.out.println("2. Check if a given number is a palindrome.");
            
            try {
                choice = input.nextInt();
                validChoice = true;
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter a string: ");
                        input.nextLine(); // Consume the newline character
                        String str = input.nextLine();
                        System.out.println("The string is " + (isPalindromeString(str) ? "" : "not ") + "a palindrome.");
                        break;
                    case 2:
                        System.out.print("Enter a number: ");
                        int num = input.nextInt();
                        System.out.println("The number is " + (isPalindromeNumber(num) ? "" : "not ") + "a palindrome.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        validChoice = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                input.nextLine(); // Consume the invalid input
            }
        }
    }
    
    public static boolean isPalindromeString(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindromeNumber(int num) {
        int originalNum = num;
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }
}
