import java.util.Scanner;
public class leapye
{
	public static void main(String[] args)
	{
		int y,m,d;
		try
		{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter Date: ");
			d=input.nextInt();
			m=input.nextInt();
			y=input.nextInt();
			System.out.print("Entered date:"+d+"/"+m+"/"+y);
			if(y%4==0 && y%100!=0 && y%400==0)
				System.out.println("\nIt is a leap year");
			else
				System.out.println("\nIt is a Non leap year");
		}
		catch(Exception e)
		{
			System.out.print("invalid due to floation value");
		}
	}
}
