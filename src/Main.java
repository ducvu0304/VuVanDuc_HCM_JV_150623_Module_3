import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String expression = "5 + 3 * 2";
        int result = calculateExpression(expression);
        System.out.println("Kết quả của biểu thức " + expression + " là: " + result);
    }


    public static int calculateExpression(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Biểu thức không hợp lệ");
        }

        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int operand = ch - '0';
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    operand = operand * 10 + (expression.charAt(i + 1) - '0');
                    i++;
                }
                operandStack.push(operand);
            }else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && hasPrecedence(ch, operatorStack.peek())) {
                    evaluateTopOperator(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    evaluateTopOperator(operandStack, operatorStack);
                }
                operatorStack.pop(); // Pop '('
            }
        }

        while (!operatorStack.isEmpty()) {
            evaluateTopOperator(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    private static boolean hasPrecedence(char operator1, char operator2) {
        if (operator2 == '(' || operator2 == ')') {
            return false;
        }
        return (operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-');
    }

    private static void evaluateTopOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        int operand2 = operandStack.pop();
        int operand1 = operandStack.pop();

        int result = 0;
        switch (operator) {
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

        operandStack.push(result);
    }
}
