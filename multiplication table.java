import java.util.*;

class A extends Thread

{

	public void run()
	{
	 	try
	 	{

	 		int n1;

 			Scanner sc=new Scanner(System.in);
 			System.out.println("number 1=");
 			n1=sc.nextInt();
 			if(n1<=0)
 			{
 				System.out.println("invalid due to negative value");
 			}
 			else
 			{
			 	for(int i=1;i<=10;i++)
				 {

					 System.out.println(n1+" X "+i+" = "+(n1*i));

				 }

 			}
		 }

		catch(Exception e)
		{
			System.out.println();
		}
	}
}
class B extends Thread

{

	public void run()
	{
	 	try
		 {

			 int n2;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("number 2=");
			 n2=sc.nextInt();
			 if(n2<=0)
			 {
			 	System.out.println("invalid due to negative value");
			 }
			 else
			 {
 				for(int i=1;i<=10;i++)

 				{

 					System.out.println(n2+" X "+i+" = "+(n2*i));				 }

			 }
 		}

		catch(Exception e)
		{
			System.out.println("invalid due to alphabets and floating value");
		}
	}
}
public class ak

{

 public static void main(String[] args)

 {

 Scanner input=new Scanner(System.in);

 A threadA=new A();

 B threadB=new B();

 threadA.start();

 threadB.start();

 }

}
