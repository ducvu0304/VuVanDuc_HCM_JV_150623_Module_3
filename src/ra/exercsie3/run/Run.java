package ra.exercsie3.run;

import ra.exercsie3.entity.Queue;

public class Run {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(3);

        queue.displayQueue();
    }
}
