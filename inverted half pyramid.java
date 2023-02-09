import java.util.*;
class invertedpyramid
{
	public static void main(String[] args)
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows:");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
