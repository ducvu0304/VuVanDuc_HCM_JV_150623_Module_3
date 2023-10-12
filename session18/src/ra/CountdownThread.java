package ra;

public class CountdownThread extends Thread {
    private int count;

    public CountdownThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (count > 0) {
            System.out.println(count);
            count--;
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CountdownThread countdownThread = new CountdownThread(10);
        countdownThread.start();
    }
}