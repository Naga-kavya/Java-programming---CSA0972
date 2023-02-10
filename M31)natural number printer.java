class NaturalNumberPrinter extends Thread {
    private int start;
    private int end;

    public NaturalNumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NaturalNumberPrinter thread1 = new NaturalNumberPrinter(1, 33);
        NaturalNumberPrinter thread2 = new NaturalNumberPrinter(34, 66);
        NaturalNumberPrinter thread3 = new NaturalNumberPrinter(67, 100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
