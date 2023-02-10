class Customer {
  int AccountNo;
  String AccName;
  int Balance = 10000;

  public synchronized void deposit(int amount) {
    Balance += amount;
    System.out.println("Deposit operation successful, balance amount: " + Balance);
    notify();
  }

  public synchronized void withdraw(int amount) {
    while (Balance < amount) {
      System.out.println("Withdraw operation temporarily suspended, balance amount: " + Balance);
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    Balance -= amount;
    System.out.println("Withdraw operation successful, balance amount: " + Balance);
  }
}
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter amount for withdraw operation: ");
    int withdrawAmount = sc.nextInt();
    System.out.print("Enter amount for deposit operation: ");
    int depositAmount = sc.nextInt();
    customer.withdraw(withdrawAmount);
    customer.deposit(depositAmount);
  }
}
