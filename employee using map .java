import java.util.HashMap;
import java.util.Map;

public class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Map<Integer, Employee> employeeRecord = new HashMap<>();

        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Jane");
        Employee emp3 = new Employee(3, "Jim");

        // Adding objects to the employeeRecord
        employeeRecord.put(emp1.id, emp1);
        employeeRecord.put(emp2.id, emp2);
        employeeRecord.put(emp3.id, emp3);

        // Check if the employeeRecord is empty
        System.out.println("Is the employeeRecord empty? " + employeeRecord.isEmpty());

        // Removing specified object
        employeeRecord.remove(2);
        System.out.println("Object removed");

        // Clear the employeeRecord
        employeeRecord.clear();
        System.out.println("Employee record cleared");
    }
}
