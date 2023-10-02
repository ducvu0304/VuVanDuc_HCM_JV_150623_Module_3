package ra;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i: list) {
            stack.push(i);
        }
        stack.forEach(System.out::println);
        System.out.println("^^^^^^^^^^^^");
        List<String> listStr  = new ArrayList<>();
        listStr.add("1");
        listStr.add("2");
        listStr.add("3");
        listStr.add("5");
        listStr.add("6");


        Deque<String> stackString = new ArrayDeque<>();
        for (String i: listStr) {
            stackString.push(i);
        }
        stackString.forEach(System.out::println);

    }
}
