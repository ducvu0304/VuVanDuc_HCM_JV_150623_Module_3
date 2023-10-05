import entity.Sort;

public class Main {
    public static void main(String[] args) {

        Integer arr[] = { 64, 34, 25, 12, 22, 11 };
        Integer[] sortArr = Sort.selectionSort(arr);

        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}