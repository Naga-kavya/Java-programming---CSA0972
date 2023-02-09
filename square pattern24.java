import java.util.*;
public class patternsquare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k=1;
		System.out.print("enter number of rows:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k*k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
