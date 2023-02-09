import java.util.*;
public class Reverseinvertedpyramid  
{  
	public static void main(String[] args)  
	{  
		int rows;  
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows:");
		rows=sc.nextInt();
		for (int i= 0; i<= rows-1; i++)  
		{  
			for (int j=0; j<=i; j++)  
			{  
				System.out.print(" ");  
			}  
			for (int k=0; k<=rows-1-i; k++)  
			{  
				System.out.print("*" + " ");  
			}  
			System.out.println();  
		}  
	}
}  
