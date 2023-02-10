import java.util.Scanner;

public class StudentGrades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks1, marks2, marks3, marks4;
    int total = 0;
    double aggregate = 0.0;
    String grade = "";
    
    try {
      System.out.print("Enter the marks in python: ");
      marks1 = sc.nextInt();
      
      System.out.print("Enter the marks in c programming: ");
      marks2 = sc.nextInt();
      
      System.out.print("Enter the marks in Mathematics: ");
      marks3 = sc.nextInt();
      
      System.out.print("Enter the marks in Physics: ");
      marks4 = sc.nextInt();
      
      total = marks1 + marks2 + marks3 + marks4;
      aggregate = (double) total / 4;
      
      if (aggregate >= 75) {
        grade = "DISTINCTION";
      } else if (aggregate >= 60 && aggregate < 75) {
        grade = "FIRST DIVISION";
      } else if (aggregate >= 50 && aggregate < 60) {
        grade = "SECOND DIVISION";
      } else if (aggregate >= 40 && aggregate < 50) {
        grade = "THIRD DIVISION";
      } else {
        grade = "FAIL";
      }
      
      System.out.println("Total: " + total);
      System.out.println("Aggregate: " + aggregate);
      System.out.println("Grade: " + grade);
    } catch (Exception e) {
      System.out.println("Invalid input. Please enter an integer.");
    }
  }
}
