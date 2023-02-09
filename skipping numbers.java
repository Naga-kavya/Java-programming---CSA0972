import java.util.*;
public class skipping
{
    public static void main(String[] args) {
        try
        {
            int m,n,k;
            Scanner obj=new Scanner(System.in);
            System.out.println("M=");
            m=obj.nextInt();
            System.out.println("N=");
            n=obj.nextInt();
            System.out.println("K=");
            k=obj.nextInt();
            if(m<=0 || n<=0 || k<=0)
            {
                System.out.println("invalid input");
            }
            else if(m>=n)
            {
             	System.out.println("invalid input");
            }
            else
            {
            	while(m<=n)
          	  {
              	  System.out.println(m);
               	 m=m+k+1;
           	 }
            }
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}
