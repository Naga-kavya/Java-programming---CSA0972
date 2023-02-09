import java.util.*;
class bank
{
    public static void main(String arg[])
    { 
    	try
    	{
    		int wd,de;
    		Scanner sc=new Scanner(System.in);
	    	System.out.println("withdraw=");
	    	wd=sc.nextInt();
	    	System.out.println("deposit=");
	    	de=sc.nextInt();
	        final Customer c = new Customer();
	        if(wd<0 || de<0)
	        {
	        	System.out.println("invalid");
	        }
	        else
	        {
	       	 new Thread()
	        	{
	           	 public void run()
	         	   {
   	             	c.withdraw(wd);
      	    	  }
     		   }.start();
   	     	new Thread()
	       	 {
	           	 public void run()
	          	  {
   	           	  c.deposit(de);
  	         	 }
   	   	  }.start();
	        }
    	}
    	catch(Exception e)
    	{
    		System.out.println("invalid input");
    	}
    }
}

class Customer
{
    int amount = 10000;

    synchronized void withdraw(int amount)
    {
        System.out.println("Available Balance " + this.amount);
        System.out.println("Going to withdraw." + amount);

        if (this.amount < amount)
        {
            System.out.println("Insufficient Balance waiting for deposit.");
            try
            {
                wait();
            } catch (Exception e)
            {
                System.out.println("Interruption Occured");
            }
        }
        this.amount -= amount;
        System.out.println("Detected amaount: " + amount);
        System.out.println("Balance amount : " + this.amount);
    }

    synchronized void deposit(int amount)
    {
        System.out.println("Going to deposit " + amount);
        this.amount += amount;
        System.out.println("Available Balance " + this.amount);
        System.out.println("Transaction completed.\n");
        notify();
    }
}
