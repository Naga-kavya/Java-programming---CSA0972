import java.math.BigInteger;
import java.util.Scanner;
public class DecimalToBinary {
  public static void main(String[] args) {
    try
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int decimal = scanner.nextInt();
    if(decimal<=0)
    {
    	System.out.print("invalid due to negative value");
    }
    else
    {
    String binary = Integer.toBinaryString(decimal);
    System.out.println("Binary representation of " + decimal + ": " + binary);

    String reverseBinary = new StringBuilder(binary).reverse().toString();
    System.out.println("Reverse of binary: " + reverseBinary);

    int reverseDecimal = new BigInteger(reverseBinary, 2).intValue();
    System.out.println("Decimal representation of reverse binary: " + reverseDecimal);
    scanner.close();
    }
    }
    catch(Exception e)
    {
    	System.out.print("invalid due to floating value and alphabetic value");
    }
  }
}
