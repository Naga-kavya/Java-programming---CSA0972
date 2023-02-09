import java.io.*;
import java.util.*;

class Leapornot
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the year:");
  int year = input.nextInt();
  if(year%4==0 && year%400==0)
  {
   System.out.println("It is leap year.");
  } else
    {
      System.out.println("It is not a leap year.");
    }
 }
}
