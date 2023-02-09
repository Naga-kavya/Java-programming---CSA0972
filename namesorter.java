import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class namesorter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    System.out.println("Enter names (type 'done' when finished):");
    while (true) {
      String name = sc.nextLine();
      if (name.equalsIgnoreCase("done")) {
        break;
      }
      names.add(name);
    }

    System.out.println("Sort names in ascending or descending order? (A/D)");
    String choice = sc.nextLine();  
    if (choice.equalsIgnoreCase("A")) {
      Collections.sort(names);
      System.out.println("Sorted names (ascending):");
    } else if (choice.equalsIgnoreCase("D")) {
      Collections.sort(names, Collections.reverseOrder());
      System.out.println("Sorted names (descending):");
    } else { 
      System.out.println("Invalid choice. Exiting...");
      System.exit(0);
    }

    for (String name : names) {
      System.out.println(name);
    }
  }
}		
