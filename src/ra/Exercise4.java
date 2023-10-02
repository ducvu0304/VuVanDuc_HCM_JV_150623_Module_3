package ra;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> stack =  new ArrayDeque<>();

        int number = 0;
        try {
            System.out.print("Nhập số lượng từ: ");
            number = Integer.parseInt(scanner.nextLine());
        }catch (InputMismatchException e){
            System.out.println("Nhập sai dịnh dạng");
        }

        for (int i = 1; i <= number; i++) {
            System.out.printf("Nhập từ thứ %d: ", i);
            String str = scanner.nextLine();
            stack.push(str);
        }

        System.out.println("Văn bản đảo ngược là");
        stack.forEach(System.out::println);
    }
}
