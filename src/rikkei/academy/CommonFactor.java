package rikkei.academy;

import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int gcd = findGCD(a, b);

        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + gcd);
    }

        public static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            return a;
        }
}
