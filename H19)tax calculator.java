import java.util.Scanner;

public class TaxCalculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the income: ");
      int income = sc.nextInt();
      int taxableIncome = income - 250000;
      double tax = 0;

      if (taxableIncome <= 0) {
         System.out.println("Taxable Income: 0");
      } else if (taxableIncome <= 250000) {
         System.out.println("Taxable Income: " + taxableIncome);
      } else if (taxableIncome <= 500000) {
         tax = taxableIncome * 0.1;
         System.out.println("Taxable Income: " + taxableIncome);
      } else if (taxableIncome <= 1000000) {
         tax = (taxableIncome * 0.2) + 25000;
         System.out.println("Taxable Income: " + taxableIncome);
      } else {
         tax = (taxableIncome * 0.3) + 125000;
         System.out.println("Taxable Income: " + taxableIncome);
      }

      System.out.println("Tax= " + (int)tax);
   }
}
