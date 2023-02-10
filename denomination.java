import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAmount = 0;
        int[] denominations = new int[4];
        int[] notes = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "th Denomination: ");
            denominations[i] = input.nextInt();
            System.out.print("Enter the " + (i + 1) + "th Denomination number of notes: ");
            notes[i] = input.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            totalAmount += denominations[i] * notes[i];
        }
        
        System.out.println("Total Available Balance in ATM: " + totalAmount);
    }
}
