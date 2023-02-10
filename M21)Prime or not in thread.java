import java.util.Scanner;

public class PrimeNumber implements Runnable {
  int num;

  PrimeNumber(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    int flag = 0;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println(num + " is Prime");
    } else {
      System.out.println(num + " is not Prime");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PrimeNumber p = new PrimeNumber(n);
    Thread t = new Thread(p);
    t.start();
  }
}
