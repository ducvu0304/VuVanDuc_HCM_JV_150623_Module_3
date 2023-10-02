package ra;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Viết chương trình sử dụng stack để kiểm tra xem một chuỗi đầu vào có cặp dấu ngoặc đúng hay không.");
        String expression = "{([])}";

        if (checkBracketBalanced(expression))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }

    static boolean checkBracketBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);

            if (x == '{' || x == '[' || x == '(') {
                stack.push(x);
            }

            if (stack.isEmpty()) {
                return false;
            }


            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
