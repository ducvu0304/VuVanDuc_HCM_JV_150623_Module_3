package bai_tap_tong_hop;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exist = false;
        int choice;
        int number;

        do {
            System.out.println("*************MENU*************");
            System.out.println("1. Kiểm tra số chẵn/lẻ.");
            System.out.println("2. Kiểm tra số nguyên tố. ");
            System.out.println("3. Kiểm tra số kiểm tra số hoàn hảo. ");
            System.out.println("4. In ra các số chia hết cho 3 và 5 trong khoảng 1-number. ");
            System.out.println("5. Tính tổng các ước số của number. ");
            System.out.println("6. Tính tổng các sô nguyên tố trong khoảng 1-number.");
            System.out.println("7. Nhập 2 số nguyên (number1, number2), " +
                    "kiểm tra number có trong khoảng (number1, number2");
            System.out.println("8. Thoát");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            do {
                System.out.print("Enter positive integer greater than 0: ");
                number = sc.nextInt();

            } while (number < 1);

            switch (choice) {
                case 1:
                    System.out.println("==================Result==================");

                    if (number % 2 == 0) {
                        System.out.println(number + " is even number");
                    } else {
                        System.out.println(number + " is odd number");
                    }

                    System.out.println("==========================================");

                    break;
                case 2:
                    System.out.println("==================Result==================");

                    if(isPrime(number)) {
                        System.out.println(number + " is  prime number");
                    }else {
                        System.out.println(number + " is not prime number");
                    }

                    System.out.println("==========================================");

                    break;
                case 3:
                    System.out.println("==================Result==================");

                    if(isPerfectNumber(number)) {
                        System.out.println(number + " is perfect number");
                    }else {
                        System.out.println(number + " is not perfect number");
                    }

                    System.out.println("==========================================");

                    break;
                case 4:
                    System.out.println("==================Result==================");

                    ArrayList listNumber = new AttributeList();

                    for(int i = 1; i <= number; i++) {
                        if(i % 15 == 0) {
                            listNumber.add(i);
                        }
                    }

                    if(listNumber.size() > 0 ) {
                        System.out.println("DivisibleByThreeAndFive List is " + listNumber);
                    }else {
                        System.out.println("No DivisibleByThreeAndFive List ");
                    }

                    System.out.println("==========================================");
                    break;
                case 5:
                    System.out.println("==================Result==================");

                    int SumOfDivisorNumber = 0;

                    for(int i = 1; i <= number; i++) {
                        if(number % i == 0) {
                            SumOfDivisorNumber += i;
                        }
                    }

                    System.out.println("Sum of divisor number is " + SumOfDivisorNumber);

                    System.out.println("==========================================");
                    break;
                case 6:
                    System.out.println("==================Result==================");

                    int SumOfPrimeNumber = 0;

                    for (int i=1; i <= number; i++) {
                        if(isPrime(i)) {
                            SumOfPrimeNumber += i;
                        }
                    }
                    System.out.println("Sum of prime number is " + SumOfPrimeNumber);

                    System.out.println("==========================================");
                    break;
                case 7:
                    int number1, number2;

                    do {
                        System.out.print("Enter number_1: ");
                        number1 = sc.nextInt();

                        System.out.print("Enter number_2: ");
                        number2 = sc.nextInt();

                    } while (number1 < 1 || number2 < 1);

                    if(number >= number1 && number <= number2) {
                        System.out.println(number + " is in the range " + number1 + " to "+ number2);
                    }else {
                        System.out.println(number + " is not in the range " + number1 + " to "+ number2);
                    }

                    break;
                case 8:
                    exist = true;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (!exist);

        System.out.println("Menu has exited!");
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if(number <= 1) {
            return false;
        }

        for(int i=1; i < number; i++){
            if(number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
          return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
