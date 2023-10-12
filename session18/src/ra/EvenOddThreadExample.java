package ra;

public class EvenOddThreadExample {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddTHread());

        evenThread.start();
        oddThread.start();
    }
}

class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even thread: " + i);
        }
    }
}

class OddTHread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println("Odd thread: " + i);
        }
    }
}
