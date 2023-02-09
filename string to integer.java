import java.util.*;
class stringtoint
{
	public static void main(String[] args)
	{
		try
		{
			String s;
			Scanner sc=new Scanner(System.in);
			System.out.print("enter any string:");
			s=sc.next();
			Integer i=Integer.valueOf(s);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.print("invalid");
		}
	}
}
