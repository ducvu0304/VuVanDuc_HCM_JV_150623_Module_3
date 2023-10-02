package ra;

import java.util.Stack;

public class Exercise10 {
    public static void main(String[] args) {
        String expression = "5 + 3 * 2";
        int result = calculateExpression(expression);
        System.out.println("Kết quả của biểu thức " + expression + " là: " + result);


    }

        public static int calculateExpression(String expression) {
            if (expression == null || expression.isEmpty()) {
                throw new IllegalArgumentException("Biểu thức không hợp lệ");
            }

            Stack<Integer> stack = new Stack<>();
            String[] tokens = expression.split(" ");

            for (String token : tokens) {
                if (token.matches("-?\\d+")) {
                    // Nếu token là một số nguyên
                    stack.push(Integer.parseInt(token));
                } else if (token.equals("+")) {
                    // Nếu token là phép cộng
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 + operand2);
                } else if (token.equals("-")) {
                    // Nếu token là phép trừ
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 - operand2);
                } else if (token.equals("*")) {
                    // Nếu token là phép nhân
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 * operand2);
                } else if (token.equals("/")) {
                    // Nếu token là phép chia
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 / operand2);
                } else {
                    throw new IllegalArgumentException("Biểu thức không hợp lệ");
                }
            }

            return stack.pop();
        }
    }

