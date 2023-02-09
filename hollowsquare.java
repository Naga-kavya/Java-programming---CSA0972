import java.util.*;

class hollowsquare 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the size of square:");
       int size = input.nextInt();
       for (int row = 1; row <= size; row++) 
       {
            for (int col = 1; col <= size; col++) 
            {
                if (row == 1 || row == size || col == 1 || col == size) 
                {
                    System.out.print("* ");
                } else 
                  {
                    System.out.print("  ");
                  }
            }
            System.out.println();
        }
    }
}
