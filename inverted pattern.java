import java.util.*;

public class invertedpattern {


    public static void main(String[] args) {
        int r,i,j,k;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Inverted Pyramid Pattern Rows = ");
        r= sc.nextInt();

        System.out.println("Printing Inverted Pyramid Star Pattern");

        for (i = r ; i >= 1; i-- )
        {
            for (j = 0 ; j < r - i; j++ )
            {
                System.out.print(" ");
            }
            for (k = 0 ; k != (2 * i) - 1; k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
