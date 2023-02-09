import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

class factors 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int number = input.nextInt();
    List<Integer> factors = findFactors(number);
    System.out.println("The factors of " + number + " are: " + factors);
  }

  public static List<Integer> findFactors(int number)
  {
    List<Integer> factors = new ArrayList<>();
    int max = (int) Math.sqrt(number);
    for (int i = 1; i <= max; i++)
    {
      if (number % i == 0)
      {
        factors.add(i);
        if (i != number / i)
        {
          factors.add(number / i);
        }
      }
    }
    return factors;
  }
}
