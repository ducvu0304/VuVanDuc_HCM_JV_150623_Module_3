package ra;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(" Viết chương trình sử dụng queue để lưu trữ và in ra các phần tử của một danh sách đầu vào.");
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);

        queue.forEach(System.out::println);
    }
}
