package rikkei.academy;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if(isPrime(number)) {
            System.out.println(number + " là số nguyên tố");
        }else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }

    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }

        for(int i = 2; i < Math.sqrt(number); i++) {
            if(number%i  == 0) {
                return false;
            }
        }

        return true;
    }
}
