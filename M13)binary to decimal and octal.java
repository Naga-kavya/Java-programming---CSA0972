import java.util.Scanner;

public class BinaryToDecimalOctal {
  
  public static int binaryToDecimal(String binary) {
    int decimal = 0;
    int binaryLength = binary.length();
    for (int i = 0; i < binaryLength; i++) {
      if (binary.charAt(i) == '1') {
        decimal += Math.pow(2, binaryLength - i - 1);
      }
    }
    return decimal;
  }
  
  public static String decimalToOctal(int decimal) {
    String octal = "";
    while (decimal > 0) {
      octal = (decimal % 8) + octal;
      decimal /= 8;
    }
    return octal;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Given Number: ");
    String binary = sc.nextLine();
    int decimal = binaryToDecimal(binary);
    String octal = decimalToOctal(decimal);
    System.out.println("Decimal Number: " + decimal);
    System.out.println("Octal: " + octal);
  }
}
