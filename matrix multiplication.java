import java.util.*;
class matrixmultiplication
{
    public static void main(String args[]){
        int m,n,p,q,i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        m= s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        n= s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        p= s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        q = s.nextInt();
        if (n!= p) {
            System.out.println("Matrix multiplication is not possible");
        }
        else {
            int a[][] = new int[m][n];
            int b[][] = new int[p][q];
            int c[][] = new int[m][q];
            System.out.println("Enter values for matrix A : \n");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    a[i][j] = s.nextInt();
            }
            System.out.println("Enter values for matrix B : \n");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++)
                    b[i][j] = s.nextInt();
            }
            System.out.println("Matrix multiplication is : \n");
            for(i = 0; i < m; i++) {
                for(j = 0; j < q; j++){
                    c[i][j]=0;
                    for(k = 0; k < p; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
