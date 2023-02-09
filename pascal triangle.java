import java.util.*;
public class pascaltriangle
{
    public static void main(String[] args)
    {
        int r,coef=1,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows:");
        r=sc.nextInt();
        for(i=0;i<r;i++)
        {
            for(n=1;n<=r-i;n++)
            {
                System.out.println(" ");
            }
            for(j=0;j<=i;j++)
            {
                if(j==0 || i==0)
                {
                    coef=1;
                }
                else
                {
                    coef=coef*(i-j+1)/j;
                }
                System.out.print(coef);
            }
            System.out.println(" ");
        }
    }
}
