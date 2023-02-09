import java.util.*;
public class starpyramidpattern  
{    
	public static void main(String args[])   
	{     
		int i, j, row;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows:");
		row=sc.nextInt();        
		for (i=0; i<row; i++)   
		{     
			for (j=row-i; j>1; j--)   
			{
				System.out.print(" ");   
			}    
			for (j=0; j<=i; j++ )   
			{       
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}   
}  
