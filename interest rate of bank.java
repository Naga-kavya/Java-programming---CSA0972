import java.util.*;
public class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}  
}
class SBI extends Bank
{  
	float getRateOfInterest()
	{
		return 8.4f;
	}  
}  
class ICICI extends Bank
{  
	float getRateOfInterest()
	{
		return 7.3f;
	}  
}  
class AXIS extends Bank
{  
	float getRateOfInterest()
	{
		return 9.7f;
	}  
}  
class TestPolymorphism
{  
	public static void main(String args[])
	{  
		Bank b;  
		String B;
		float c,d,e,f;
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest()); 
		c=b.getRateOfInterest(); 
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		d=b.getRateOfInterest();
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
		e=b.getRateOfInterest();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank name:");
		B=sc.next();
		System.out.println("Enter rate of interest:");
		f=sc.nextFloat();
		if(f!=c && f!=d && f!=e)
		{
			System.out.println("Rate of interest is invalid");
		}
		if(B.equals("SBI") && f==c)
		{
			System.out.println("VALID");
		}
		if(B.equals("ICICI") && f==d)
		{
			System.out.println("VALID");
		}
		if(B.equals("AXIS") && f==e)
		{
			System.out.println("VALID");
		}
		if(!B.equals("SBI") && !B.equals("ICICI") && !B.equals("AXIS"))
		{
			System.out.println("Bank name is Invalid");
		}
	}  
}
