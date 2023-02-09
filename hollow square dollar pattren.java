import java.util.*;

public class HollowSquare
{
	
	public static void main(String[] args) {
		int side,i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Square Side = ");
		side = sc.nextInt();
		
		System.out.println("Printing Hollow Square Pattern");
		
		for (i= 0; i < side; i++ ) 
		{
			for (j= 0 ; j < side; j++ ) 
			{
				if (i == 0 || i == side - 1 || j == 0 || j == side - 1) 
				{
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
