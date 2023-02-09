import java.util.*;
public class fibonaccisum
{
	public static void main(String[] args)
	{
		try
		{
			int n,i,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of terms=");
			n=sc.nextInt();
			int fibonacci[]=new int[2*n+1];
			fibonacci[0]=0;
			fibonacci[1]=1;
			for(i=2;i<=2*n;i++)
			{
				fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
				if(i%2==0)
				{
					sum=sum+fibonacci[i];
				}
			}
			System.out.printf("Even sum of fibonacci series till number %d is %d",n,sum);
		}
		catch(Exception e)
		{
			System.out.println("invalid input");
		}
	}
}
