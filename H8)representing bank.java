class BankAccount {
    String name;
    int accountNumber;
    String accountType;
    double balance;
    final double MIN_BALANCE = 500.00;

    public BankAccount(String name, int accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void readAccountDetails(String name, int accountNumber, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayBalance() {
        System.out.println("Depositor Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 12345, "Savings", 1000.00);
        account.displayBalance();
    }
}
