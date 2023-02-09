import java.io.*;
import java.util.*;

class Fibonacci 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the range to be printed:");
    int n = input.nextInt();
    int prev = 0, curr = 1;
    System.out.print(prev + " " + curr);
    
    for (int i = 2; i < n; i++) 
    {
      int next = prev + curr;
      System.out.print(" " + next);
      prev = curr;
      curr = next;
    }
  }
}
