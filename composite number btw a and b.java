import java.util.*;

public class composite{
    public static void main(String[] Args){
        try
        {
     	   int a,b,i,j;
    	    Scanner sc = new Scanner(System.in);

    	    System.out.println("Enter A : ");
      	  a = sc.nextInt();

  	      System.out.println("Enter B : ");
   	     b = sc.nextInt();

 	       int negetive = 0, count = 0;
	
    	    if(a < 0 || b < 0){
     	       System.out.println("invalid due to negative value");
   	     }
     	   else if(a==b)
     	   {
     	   	System.out.println("Same number cannot be possible");
   	     }
     	   else
     	   {

		        System.out.println("COMPOSITE NUMBERS : ");	
     	 	  if(a < b){
          	 	 for(i = a+1; i<b;i++){
             	   count = 0;
             	   for(j  = 1; j<=i;j++){
                    	if(i%j == 0){
                      	  count = count+1;
                  	  }
               	 }
             	   if(count > 2){
                    	System.out.print(i + "\t");
	               	 }
          		  }
       		 }
      		  else if(a > b){
          		  for(i = b+1; i<a;i++){
              	 	 count = 0;
              	  for(j  = 1; j<=i;j++){
                  	  if(i%j == 0){
              	          count = count+1;
               	     }
               	 }
               	 if(count > 2){
                    	System.out.print(i + "\t");
              	  }
           	 }
       	 }
        }
        }
        catch(Exception e)
        {
        	System.out.println("Invalid input");
        }
    }
}
