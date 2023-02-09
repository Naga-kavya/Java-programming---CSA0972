import java.util.Scanner;
class special
{
	public static void main(String args[])
	{
		String s;
		int len,sp=0,i;
		Scanner input=new Scanner(System.in);
		System.out.print("enter any string:");
		s=input.nextLine();
		len=s.length();
		char a[]=new char[len];
		for(i=0;i<len;i++)
		{
			a[i]=s.charAt(i);
			if(a[i]>=65 && a[i]<=90 ||a[i]>=97 && a[i]<=122 || a[i]>=48 && a[i]<=57)
 			{
 			}
 			else
 			{
 				sp++;
 				System.out.print("\nspecial characters are:"+a[i]);
 			}
		}
		System.out.println("\nnumber of special characters are:"+sp);
	}
}
