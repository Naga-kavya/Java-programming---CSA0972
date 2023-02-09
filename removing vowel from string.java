import java.util.Scanner;
public class removevowels
{
	public static void main(String[] args) 
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any string:");
		s = sc.nextLine();
       		String s1 = "";
        	s1 = s.replaceAll("[aeiou]", ""); 
        	System.out.println("String after removing vowel : "+s1); 
	}

}
