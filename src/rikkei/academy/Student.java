package rikkei.academy;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int count = 0;
        int[] array ;

        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();

            if(size > 30) System.out.println("Size does not exceed 30");
        }while (size > 30);

        array = new int[size];

        System.out.print("List of mark: ");
        for(int i=0; i < size;  i++) {
            do {
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                array[i] = sc.nextInt();
                if (array[i] < 0 || array[i] > 10)
                    System.out.println("The entered score  is in the range 5 to 10 ! ");

                if(array[i] >= 5)
                    count++;

            }while (array[i] < 0 || array[i] > 10);
        }

        System.out.print("\n The number of students passing the exam is " + count);
    }

}
