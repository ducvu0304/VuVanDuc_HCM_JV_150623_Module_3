package ra;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise5 {
    public static void main(String[] args) {
        String str = "mam";

        if(isPalindrome(str)) {
            System.out.println(str + " là Palindrome.");
        }else {
            System.out.println(str + " không là Palindrome.");
        }

    }

    static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();

        str =  str.replaceAll("\\s", "").toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }

        System.out.println(queue);

        StringBuilder reversedString =  new StringBuilder();

        while (!queue.isEmpty()) {
            reversedString.append(queue.remove());
        }

        return str.equals(reversedString.toString());
    }
}
