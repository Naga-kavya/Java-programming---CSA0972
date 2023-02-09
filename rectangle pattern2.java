import java.util.*;
class rectangle
{
	public static void main(String[] args)
	{
		int r,c,i,j;
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		r=a.nextInt();
		System.out.println("Enter the number of columns:");
		c=a.nextInt();
		System.out.println("Enter the symbol:");
		String s=b.nextLine();
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				System.out.print(s+"");
			}
			System.out.print("\n");
		}
	}
}
