package ra;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Exercise11 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2423);
        stack.push(2212);
        stack.push(24321);
        stack.push(2221);
        stack.push(2432);
        stack.push(2444);

        int max = stack.pop();
        while (!stack.empty()) {
            if(max < stack.peek()) {
                max = stack.pop();
            }else {
                stack.pop();
            }
        }

        System.out.println("Max value: " + max);

    }
}
