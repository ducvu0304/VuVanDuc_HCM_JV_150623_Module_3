package ra;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberThread extends Thread {
    private int start;
    private int end;
    private List<Integer> primeNumbers;

    public PrimeNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.primeNumbers = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> getPrimeNumbers() {
        return primeNumbers;
    }
}

class PrimeNumberFinder {
    public static void main(String[] args) {
        PrimeNumberThread thread1 = new PrimeNumberThread(1, 5000);
        PrimeNumberThread thread2 = new PrimeNumberThread(5001, 10000);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.addAll(thread1.getPrimeNumbers());
        primeNumbers.addAll(thread2.getPrimeNumbers());

        System.out.println("Danh sách các số nguyên tố từ 1 đến 10,000:");
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }
}