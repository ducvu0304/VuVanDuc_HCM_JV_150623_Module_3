package entity;

import java.util.List;

public class Sort {
    public static <T> T[] selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(!arr[i].equals(arr[j])) {
                    swap(arr, i, j);
                }
            }
        }

        return arr;
    }

    public static <T> T[] bubbleSort(T[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length -1 ; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if(arr[j].equals(arr[j+1]))  {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }

        return arr;
    }



    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
}
