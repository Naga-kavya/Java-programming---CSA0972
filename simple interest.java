import java.util.*;
public class interest
{
    public static void main(String[] args)
    {
        try
        {
            int pa,y,si,SI,r;
            char s;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the principal amount:");
            pa=sc.nextInt();
            System.out.println("enter the no.of years:");
            y=sc.nextInt();
            System.out.println("is customer senior citizen(y=yes/n=no):");
            s=sc.next().charAt(0);
            if(s=='n' || s=='N')
            {
                r=10;
                si=(pa*y*r)/100;
                System.out.println("simple interest="+si);
            }
            else if(s=='y' || s=='Y')
            {
                r=12;
                SI=(pa*y*r)/100;
                System.out.println("simple interest="+SI);
            }
            else
            {
                System.out.println("invalid");
            }
            if(pa<=0)
            {
                System.out.println("enter the valid amount");
            }
            if(y<=0)
            {
                System.out.println("enter the valid no.of years");
            }
        }
        catch(Exception e)
        {
            System.out.println("invalid input");
        }
    }
}
