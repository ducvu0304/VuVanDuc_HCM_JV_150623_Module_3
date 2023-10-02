package ra;

import java.util.Stack;

public class Exercise13 {
    public static void main(String[] args) {
        String str = "987654321";
        String test2 = "plkiujnhad";
        String test3 = "zyxwvutsrqpo";

        System.out.println(isDecreasingOrder(test3));
    }

    static boolean isDecreasingOrder(String str) {
        Stack<Character> stack =  new Stack<>();
        str = str.replaceAll("\\s","");

        for (char c : str.toCharArray()) {
            if(str.isEmpty() || c < stack.peek() ){
                stack.push(c);
            }else {
                return false;
            }
        }

        return true;
    }
}
