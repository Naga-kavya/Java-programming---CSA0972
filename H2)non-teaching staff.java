import java.util.Scanner;

public class CollegeUsers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Total Users: ");
    int totalUsers = sc.nextInt();
    System.out.print("Staff Users: ");
    int staffUsers = sc.nextInt();
    int studentUsers = totalUsers - staffUsers;
    int nonTeachingStaff = staffUsers / 3;
    System.out.println("Student Users: " + studentUsers);
    System.out.println("Non-Teaching Staff Users: " + nonTeachingStaff);
  }
}
