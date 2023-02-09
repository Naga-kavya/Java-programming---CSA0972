import java.io.*;
import java.util.*;

class Factorial
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int i,fact=1;
    for(i=1;i<=num;++i)
        {
            fact *= i;
        }
    System.out.printf("Factorial of %d = %d", num, fact);
  }
}
