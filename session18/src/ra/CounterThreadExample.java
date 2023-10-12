package ra;

public class CounterThreadExample {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread incrementThread = new Thread(() -> {
            while (true) {
                synchronized (CounterThreadExample.class) {
                    counter++;
                    System.out.println("Increment Thread: Counter value = " + counter);
                }
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decrementThread = new Thread(() -> {
            while (true) {
                synchronized (CounterThreadExample.class) {
                    counter--;
                    System.out.println("Decrement Thread: Counter value = " + counter);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        incrementThread.start();
        decrementThread.start();
    }
}