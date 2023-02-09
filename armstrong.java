import java.util.*;
class armstrong
{
	public static void main(String[] args)
	{
		try
		{
			Scanner input=new Scanner(System.in);
			System.out.print("enter any number");
			int n=input.nextInt();
			int num1=n;
			int arm=0;
			while(num1!=0)
			{
				int rem=num1%10;
				arm=arm+(rem*rem*rem);
				num1=num1/10;
			}
			if(n==arm)
				System.out.print("Armstrong number");
			else
				System.out.print("Not Armstrong");
		}
		catch(Exception e)
		{
			System.out.print("invalid due to floating point");
		}
	}
}
