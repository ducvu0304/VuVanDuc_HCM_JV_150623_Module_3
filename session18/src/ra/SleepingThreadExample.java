package ra;

import java.util.Scanner;

public class SleepingThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giây để thread ngủ: ");
        int seconds = scanner.nextInt();
        Thread sleepingThread = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread đang ngủ...");
                    Thread.sleep(seconds * 1000);
                    System.out.println("Thread đã ngủ dậy.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        sleepingThread.start();
    }
}