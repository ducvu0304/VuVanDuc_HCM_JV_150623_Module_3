package rikkei.academy;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size > 20)
                System.out.println("Size does not exceed 20");

        }while (size > 20);

        array = new int[size];

        for (int  i = 0; i < size; i++){
            System.out.printf("array[%d] =" +
                    " " , i+1);
            array[i] =  sc.nextInt();
        }

        ReverseArray(array);
        print(array);
    }

    public static void print(int[] arr) {
        System.out.print("Element in array: ");
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                System.out.print(arr[i] + ",");
            }else {
                System.out.print(arr[i]);
            }
        }
    }

    public static void ReverseArray(int[] arr) {
        int i, j;
        for(i = 0, j=arr.length -1;  i < j; i++, j-- ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
