import java.util.*;
class squarecube
{
 public static void main(String[] args)
 {
  float n;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter number:");
  n=sc.nextFloat();
  if(n<0)
  {
   System.out.print("invalid due to negative");
  }
  else
  {
   System.out.print("Square Number:"+(n*n));
   System.out.print("\nCube Number:"+(n*n*n));
  }
 }
}
