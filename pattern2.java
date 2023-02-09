import java.util.*;
class pattern1
{
 public static void main(String[] args)
 {
 int i, j,r;
 char ch;
 Scanner s= new Scanner(System.in);
 System.out.print(" Please Enter any Character : ");
 ch = s.next().charAt(0);
 System.out.println("Enter the no.of.rows:");
 r= s.nextInt();
 
 for(i=0; i<r; i++)
 {
 for(j=i; j>=0; j--)
 System.out.print(ch+" ");
 System.out.print("\n");
 }
 for(i=0; i<(r-1); i++)
 {
 for(j=(r-1); j>i; j--)
 System.out.print(ch+" ");
 System.out.print("\n");
 }
 }
}
