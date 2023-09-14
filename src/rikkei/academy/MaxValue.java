package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double maxValue;
        int i = 0;
        int size;
        double[] array;

        do{
            System.out.print("Enter size: ");
            size = sc.nextInt();
            if(size > 20) System.out.println("Size does not exceed 20");
        }while (size > 20);

        array = new double[size];

        while( i < size) {
            System.out.printf("arr[%d] = ", i+1);
            array[i] = sc.nextInt();
            i++;
        }

        maxValue = findMaxValue(array);
        System.out.println("Max value: " + maxValue);
    }

    static double findMaxValue (double[]arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[0];
    }
}
