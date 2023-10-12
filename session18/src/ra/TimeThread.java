package ra;

public class TimeThread extends Thread{
    public void run() {
        try {
            for (int i = 0; i <=10 ; i++) {
                System.out.println("Counting: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TimeThread timeThread = new TimeThread();
        timeThread.start();
    }
}
