import java.util.Scanner;

public class ElectricityBill {
   int consumerNo;
   String consumerName;
   int prevReading;
   int currReading;
   int unitConsumed;
   double billAmount;

   public void readData() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter consumer number: ");
      consumerNo = sc.nextInt();
      System.out.print("Enter consumer name: ");
      consumerName = sc.next();
      System.out.print("Enter previous month reading: ");
      prevReading = sc.nextInt();
      System.out.print("Enter current month reading: ");
      currReading = sc.nextInt();
   }

   public void computeBill() {
      unitConsumed = currReading - prevReading;
      if (unitConsumed <= 100) {
         billAmount = unitConsumed * 1;
      } else if (unitConsumed <= 200) {
         billAmount = (100 * 1) + ((unitConsumed - 100) * 2.5);
      } else if (unitConsumed <= 500) {
         billAmount = (100 * 1) + (100 * 2.5) + ((unitConsumed - 200) * 4);
      } else {
         billAmount = (100 * 1) + (100 * 2.5) + (300 * 4) + ((unitConsumed - 500) * 6);
      }
   }

   public void displayBill() {
      System.out.println("Consumer No: " + consumerNo);
      System.out.println("Consumer Name: " + consumerName);
      System.out.println("Unit Consumed: " + unitConsumed);
      System.out.println("Bill Amount: " + billAmount);
   }

   public static void main(String[] args) {
      ElectricityBill eb = new ElectricityBill();
      eb.readData();
      eb.computeBill();
      eb.displayBill();
   }
}
