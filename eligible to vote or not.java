import java.util.*;
public class voting
{
    public static void main(String args[])
    {
        try
        {
            int age,n;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your age:");
            age=sc.nextInt();
            if(age>=18)
            {
                System.out.println("your are eligible to vote");
            }
            else if(age<=0)
            {
                System.out.println("invalid input");
                System.out.println("enter a positive integer");
            }
            else
            {
                n=18-age;
                System.out.println("not eligible to vote");
                System.out.println("you are allowed to vote after "+n+" years");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("invalid input due to floating point or character string");
        }
    }
}
