class Calculator implements Runnable {
  private int operation;
  private int num1;
  private int num2;
  
  public Calculator(int operation, int num1, int num2) {
    this.operation = operation;
    this.num1 = num1;
    this.num2 = num2;
  }
  
  @Override
  public void run() {
    switch (operation) {
      case 1:
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        break;
      case 2:
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;
      case 3:
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        break;
      case 4:
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        break;
      default:
        System.out.println("Invalid operation");
        break;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Calculator(1, 10, 20));
    Thread t2 = new Thread(new Calculator(2, 30, 10));
    Thread t3 = new Thread(new Calculator(3, 5, 4));
    Thread t4 = new Thread(new Calculator(4, 20, 5));
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
