package ra;

import java.util.Stack;

public class Exercise15 {
    public static void main(String[] args) {
        int decimalNumber = 10;
        String binary = decimalToBinary(decimalNumber);

        System.out.println("Hệ nhị phân: " + binary);
    }

    public static String decimalToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
