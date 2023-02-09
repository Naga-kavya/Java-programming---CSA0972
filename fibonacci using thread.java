import java.util.*;
class Fibonacci  extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0,n;
               Scanner sc=new Scanner(System.in);

              

               System.out.print("Enter the Limit for fabonacci: ");

                n = sc.nextInt();
               if(n<=0)
               {
               	System.out.println("invalid due to negative value");
               }
               else
               {
               	System.out.println("Fibonacci series:");
              	 while (n>0)
              	 {
                 	   System.out.print(c+" ");
                 	   a=b;
                 	   b=c;
              	      c=a+b;
             	       n=n-1;
           	    }
          	}
          }
          catch(Exception e)
          {
               System.out.println("invalid due to floating point or alphabets");	
          }
     }
}

class Fib
{
     public static void main(String[] args)
     {
          try
          {
               Fibonacci fib = new Fibonacci();
               fib.start();
              
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
