package ra;

import java.util.Random;

public class RandomNumberTHread extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("random number: " + randomNumber);
    }

    public static void main(String[] args) {
        RandomNumberTHread randomNumberTHread = new RandomNumberTHread();
        randomNumberTHread.start();
    }
}
