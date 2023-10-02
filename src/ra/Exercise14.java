package ra;

import java.util.Stack;

public class Exercise14 {
    public static void main(String[] args) {
        String test1 = "2357";
        String test2 = "1243";

        System.out.println(isPrimeSequence(test1));
        System.out.println(isPrimeSequence(test2));
    }

    static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isPrimeSequence(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c: str.toCharArray()) {
            int number = Character.getNumericValue(c);

            if(isPrime(number)) {
                stack.push(number);
            }else {
                return false;
            }
        }

        return true;
    }
}
