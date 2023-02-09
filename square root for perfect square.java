import java.util.Scanner;
import java.lang.Math;
public class squareroot
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.print("enter any number:");
  int n=input.nextInt();
  if(n<0)
  {
   System.out.print("invalid due to negative");
  }
  else
  {
   double sqrt=Math.pow(n,0.5);
   double sq=Math.sqrt(n);
   System.out.println(sqrt+","+"-"+sqrt);
  }
 }
}
