import java.io.*;
import java.util.*;
class validid
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the ID:");
  String ID = input.nextLine();
  System.out.println("ReEnter the ID:");
  String reID = input.nextLine();
  if(ID==reID)
  {
   System.out.println("Valid Input.");
  }
  else
  {
   System.out.println("Invalid Inpt.");
  } 
 }
}
