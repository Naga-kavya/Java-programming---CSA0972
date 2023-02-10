import java.util.Scanner;

public class BonusCalculation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salary = 0;
    char grade = ' ';
    double bonus = 0;
    double total = 0;
    
    try {
      System.out.print("Enter the grade of the employee: ");
      grade = sc.next().charAt(0);
      System.out.print("Enter the employee salary: ");
      salary = sc.nextDouble();
      
      if (grade == 'A') {
        bonus = salary * 0.05;
      } else if (grade == 'B') {
        bonus = salary * 0.1;
      }
      
      if (salary < 10000) {
        bonus += salary * 0.02;
      }
      
      total = salary + bonus;
      
      System.out.println("Salary: " + salary);
      System.out.println("Bonus: " + bonus);
      System.out.println("Total to be paid: " + total);
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter a valid grade (A or B) and salary (in dollars).");
    }
  }
}
