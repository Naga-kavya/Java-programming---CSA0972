class FibonacciRunnable implements Runnable {
  private int num;

  FibonacciRunnable(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    int first = 0, second = 1, sum;
    System.out.println("Thread " + Thread.currentThread().getName() + " started");
    System.out.println(first);
    System.out.println(second);
    for (int i = 2; i < num; i++) {
      sum = first + second;
      first = second;
      second = sum;
      System.out.println(sum);
    }
    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
  }
}

public class FibonacciSeries {
  public static void main(String[] args) {
    System.out.println("Main thread started");
    FibonacciRunnable runnable = new FibonacciRunnable(5);
    Thread thread = new Thread(runnable);
    thread.setName("FibonacciThread");
    thread.start();
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Main thread finished");
  }
}
