import java.util.Scanner;
class perfect
{
 public static void main(String[] args)
 {
  try
  {
  Scanner input=new Scanner(System.in);
  System.out.print("enter number:");
  int n=input.nextInt();
  if(n<=0)
  {
   System.out.print("invalid due to negative value");
  }
  else
  {
   int factors=0;
   for(int i=1;i<n;i++)
   {
    if(n%i==0)
     factors=factors+i;
   }
   if(n==factors)
    System.out.print("It's a perfect number");
   else
    System.out.print("It is not a perfect number");
   }
  }
  catch(Exception e)
  {
   System.out.print("invalid input");
  }
 }
}
