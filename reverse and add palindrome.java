import java.util.Scanner;

public class ReverseAddPalindrome
{
	
	
	static int reverseNumber(int num)
	{
		int rev= 0;
		
		int rem = 0;
		
		while (num!= 0)
		{
			rem = num% 10;
			
			rev = (rev*10) + rem;
			
			num = num/10;
		}
		
		return rev;
	}
	
	
	
	static boolean checkPalindrome(int num)
	{
		int rev = reverseNumber(num);
		
		if(rev == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void reverseAndAdd(int num)
	{
		if(checkPalindrome(num))
		{
			System.out.println("Given Number is already a palindrome");
		}
		else
		{
			while (!checkPalindrome(num))
			{
				int rev = reverseNumber(num);
				
				int sum = num+ rev;
				
				System.out.println(num+" + "+rev+" = "+sum);
				
				num = sum;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Number : ");
		
			int in= sc.nextInt();
			if(in<=0)
			{
				System.out.println("invalid input");
				System.out.println("enter a positive integer");
			}
			else
			{
				reverseAndAdd(in);
			}
		}
		catch(Exception e)
		{
			System.out.println("invalid due alphabets or floating value");
		}
	
	}
}
