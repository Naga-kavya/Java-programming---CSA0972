import java.util.HashMap;

public class BankDetails {
    static HashMap<Integer, String> bankDetails = new HashMap<>();

    public static void addRecord(int accountNumber, String customerName) {
        bankDetails.put(accountNumber, customerName);
        System.out.println("Record added successfully");
    }

    public static void displaySize() {
        System.out.println("Size of HashTable: " + bankDetails.size());
    }

    public static void clearTable() {
        bankDetails.clear();
        System.out.println("HashTable cleared successfully");
    }

    public static void main(String[] args) {
        addRecord(1001, "John Doe");
        addRecord(1002, "Jane Doe");
        addRecord(1003, "Jim Smith");

        displaySize();

        clearTable();

        displaySize();
    }
}
