package sumary_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Khởi tạo mảng số nguyên.");

        do {
            System.out.print("Enter size: ");
            size = Integer.parseInt(sc.nextLine());

            if (size < 1)
                System.out.println("Size is at least 1 !");
        }while (size < 1);

        int[] arrInt = new int[size];
        int choice;
        boolean isExit = false;
        do{
            System.out.println("**********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng.");
            System.out.println("2. Hiển thị giá trị các phần tử mảng.");
            System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng.");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng.");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng.");
            System.out.println("6. Sắp xếp mảng giảm dần.");
            System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng " +
                                  "có bao nhiêu phần tử có giá trị là m");
            System.out.println("8. Thoát.");

            System.out.print("Enter choice: ");
            choice =  sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < arrInt.length ; i++) {
                        System.out.printf("arr[%d] = ", i);
                        arrInt[i] = sc.nextInt();
                    }

                    System.out.println("=====Result=====");
                    System.out.println("Element input into array successfully!");
                    break;
                case 2:
                    System.out.println("=====Result=====");
                    print(arrInt);
                    System.out.print('\n');
                    break;
                case 3:
                    System.out.println("=====Result=====");
                    evenNumbersAndSum(arrInt);
                    System.out.print("\n");
                    break;
                case 4:
                    System.out.println("=====Result=====");
                    primeNumberAndSum(arrInt);
                    System.out.print("\n");
                    break;
                case 5:
                    int maxValue = max(arrInt);
                    int minValue = min(arrInt);

                    System.out.println("=====Result=====");
                    System.out.printf("Max: %d", maxValue);
                    System.out.print("\n");
                    System.out.printf("Min: %d", minValue);
                    System.out.print("\n");
                    break;
                case 6:
                    int[] descSortArr = descSort(arrInt).clone();
                    arrInt = descSortArr.clone();

                    System.out.println("=====Result=====");
                    System.out.println("Array: ");
                    print(descSortArr);
                    System.out.print("\n");
                    break;
                case 7:
                    System.out.print("Enter integer: ");
                    int value = sc.nextInt();
                    int count = countNumber(arrInt, value);

                    System.out.println("=====Result=====");
                    if(count > 0) {
                        System.out.printf("The value %d has %d" +
                                " elements in the array ", value, count);
                    }else {
                        System.out.printf("Array has not %d  of value", value);
                    }
                    System.out.print("\n");
                    break;
                case 8:
                    isExit = true;
                    break;
                default:
                    System.out.println("No choice.");
            }

        }while (!isExit);

        System.out.println("*****************");
        System.out.println("Exit menu!");
    }

    static void print (int[] arr) {
        System.out.println("Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    /****************** Even Number **********************/
    static void evenNumbersAndSum(int[] arr) {
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                System.out.printf("%d\t", arr[i]);
            }
        }

        if(sum != 0) {
            System.out.print("\n");
            System.out. printf("Sum of odd numbers is %d", sum);
        }else {
            System.out. print("Array have not even number.");
        }

    }

    /***************** Prime Number ************/
    static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void primeNumberAndSum (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])) {
                sum += arr[i];
                System.out.printf("%d\t", arr[i]);
            }
        }

        if(sum != 0) {
            System.out.print("\n");
            System.out.printf("Sum: %d", sum);
        }else {
            System.out. print("Array have not prime number.");
        }

    }

    /*************** Min and Max value *******************/
    static int max(int[] arr) {
        int maxValue = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    static int min(int[] arr) {
        int minValue = arr[0];

        for (int number: arr) {
            if(minValue > number) {
                minValue =number;
            }
        }

        return minValue;
    }

    /***************** Desc sort *********************/
    static int[] descSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    /*************** Count number in array  **********************/
    static int countNumber(int[] arr, int value) {
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == value) {
                count++;
            }
        }

        return count;
    }
}
