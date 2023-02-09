import java.util.Scanner;
public class composite
{
 public static void main(String[] args)
 {
  try
  {
   int[] arr=new int[10];
   Scanner sc=new Scanner(System.in);
   System.out.print("enter number of elements in array:");
   int n=sc.nextInt();
   System.out.print("enter the elements in array:");
   for(int i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   int count=0;
   for(int i=0;i<n;i++)
   {
    int c=0;
    for(int j=1;j<100;j++)
    {
     if(arr[i]%j==0) 
     {
      c++;
     }
    }  
    if(c>2)
    count++;
   }
   System.out.println("number of composite number:"+count);
  }
  catch(Exception e)
  {
   System.out.print("invalid due to floating value");
  }
 }
}
