import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String expression = "5+3*2";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

        public static int evaluateExpression(String expression) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (Character.isDigit(ch)) {
                    // If the current token is a digit, convert it to an integer and push it onto the stack
                    int operand = ch - '0';
                    while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                        operand = operand * 10 + (expression.charAt(i + 1) - '0');
                        i++;
                    }
                    stack.push(operand);
                } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    // If the current token is an operator, pop the top two operands from the stack,
                    // apply the operator, and push the result back onto the stack
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();

                    int result = 0;
                    switch (ch) {
                        case '+':
                            result = operand1 + operand2;
                            break;
                        case '-':
                            result = operand1 - operand2;
                            break;
                        case '*':
                            result = operand1 * operand2;
                            break;
                        case '/':
                            result = operand1 / operand2;
                            break;
                    }
                    stack.push(result);
                }
            }

            return stack.pop();
        }
}