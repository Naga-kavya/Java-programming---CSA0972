class MultTableThread extends Thread {
  private int num;

  MultTableThread(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + " started");
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " X " + i + " = " + num * i);
    }
    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
  }
}

public class MultiplicationTable {
  public static void main(String[] args) {
    System.out.println("Main thread started");
    MultTableThread t1 = new MultTableThread(5);
    t1.setName("Thread 1");
    MultTableThread t2 = new MultTableThread(10);
    t2.setName("Thread 2");
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Main thread finished");
  }
}
