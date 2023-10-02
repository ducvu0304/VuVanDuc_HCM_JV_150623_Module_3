package ra;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise12 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(23);
        queue.offer(24);
        queue.offer(22);
        queue.offer(23);
        queue.offer(243);

        Iterator itr = queue.iterator();

        int min = queue.poll();

        while (!queue.isEmpty()){
            if(min > queue.element()) {
                min = queue.poll();
            }else {
                queue.poll();
            }
        }

        System.out.println("Min value: " + min);
    }
}
