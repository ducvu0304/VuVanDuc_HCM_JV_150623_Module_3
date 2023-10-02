package ra;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Exercise6 {
    public static void main(String[] args) {
        String str =  "s * (s – a) * (s – b) * (s – c)";
        if(isBracketBalance(str)){
            System.out.println("Well");
        }else {
            System.out.println("Done well");
        }
    }

    static boolean isBracketBalance(String str) {
        Stack<Character> stack  = new Stack<>();

        for (char c: str.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }else if (c == '}' || c == ')' || c == ']') {
                if(stack.isEmpty()) {
                    return false;
                }

                char check = stack.pop();
                if(!isMatchingBracket(check,c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatchingBracket(char openingBracket, char closingBracket) {
        return (openingBracket ==  '(' && closingBracket ==  ')' ||
                openingBracket ==  '{' && closingBracket ==  '}' ||
                openingBracket ==  '[' && closingBracket ==  ']');
    }
}
