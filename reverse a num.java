import java.util.*;
public class ReverseNumber
{
    public static void main(String args[])
    {
        try
        {
            int n,rev=0,r;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number:");
            n=sc.nextInt();
            if(n<0)
            {
                System.out.println("invalid due negative value");
            }
            else
            {
                while(n!=0)
                {
                    r=n%10;
                    rev=rev*10+r;
                    n=n/10;
                }
                System.out.println("reversed string="+rev);
            }
        }
        catch(Exception e)
        {
            System.out.println("invalid input");
        }
    }
}
