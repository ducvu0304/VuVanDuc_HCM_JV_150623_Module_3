package ra;

public class SumThread extends Thread {
    private int start;
    private int end;
    private long sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public long getSum() {
        return sum;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int numThreads = 4;
        SumThread[] threads = new SumThread[numThreads];
        int elementsPerThread = (end - start + 1) / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int threadStart = start + i * elementsPerThread;
            int threadEnd;
            if (i == numThreads - 1) {
                threadEnd = end;
            } else {
                threadEnd = threadStart + elementsPerThread - 1;
            }
            threads[i] = new SumThread(threadStart, threadEnd);
            threads[i].start();
        }
        long totalSum = 0;
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
                totalSum += threads[i].getSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tổng các số từ 1 đến 1000: " + totalSum);
    }
}