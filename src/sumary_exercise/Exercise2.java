package sumary_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Khởi tạo mảng số nguyên.");

        do {
            System.out.print("Enter row: ");
            row = sc.nextInt();
            System.out.print("Enter col: ");
            col = sc.nextInt();

            if (row < 1 || col < 1)
                System.out.println("Row and column are at least 1 !");
        } while (row < 1 || col < 1);

        int[][] arrInt = new int[row][col];
        int choice;
        boolean isExit = false;
        do {
            System.out.println("**********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng.");
            System.out.println("2. In giá trị các phần tử theo ma trận.");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng.");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng.");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột.");
            System.out.println("7. Thoát.");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            arrInt[i][j] = sc.nextInt();
                        }
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
                    boundaryNumbersAndSum(arrInt);
                    System.out.print("\n");
                    break;
                case 4:
                    if( row == col) {
                        System.out.println("=====Result=====");
                        mainDiagonalAndSum(arrInt);
                        System.out.print("\n");
                        secondaryDiagonalAndSum(arrInt);
                        System.out.print("\n");
                    }else {
                        System.out.println("Because array is not square matrix, have not main and secondary diagonal !");
                    }

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
                    int[][] incSortArr = incSort(arrInt).clone();
                    arrInt = incSortArr.clone();

                    System.out.println("=====Result=====");
                    System.out.println("Array: ");
                    print(arrInt);
                    System.out.print("\n");
                    break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("No choice.");
            }

        } while (!isExit);

        System.out.println("*****************");
        System.out.println("Exit menu!");
    }

    static void print(int[][] arr) {
        System.out.println("Array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    /****************** Even Number **********************/
    static void boundaryNumbersAndSum(int[][] arr) {
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("%d\t", arr[i][j]);
                    sum += arr[i][j];
                }
                System.out.print("\n");
            } else {
                System.out.printf("%d\t", arr[i][0]);
                for(int m = 0; m < col-2; m++) {
                    System.out.print("\t");
                }
                System.out.printf("%d\t", arr[i][col-1]);
                System.out.print("\n");

                sum += arr[i][0];
                sum += arr[i][col - 1];
            }
        }

        System.out.print("\n");
        System.out.printf("Sum: %d", sum);
    }

    /***************** Main diagonal ************/
    static void mainDiagonalAndSum(int[][] arr) {
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i == j) {
                    System.out.printf("%d\t", arr[i][j]);
                    sum += arr[i][j];
                }else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.printf("Sum of main diagonal: %d", sum);
    }

    /***************** Secondary diagonal ************/
    static void secondaryDiagonalAndSum(int[][] arr) {
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j == (col-1-i)) {
                    System.out.printf("%d\t", arr[i][col - 1 - i]);
                    sum += arr[i][col - 1 - i];
                }else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.printf("Sum of secondary diagonal: %d", sum);
    }


    /*************** Min and Max value *******************/
    static int max(int[][] arr) {
        int maxValue = arr[0][0];
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                if (maxValue < arr[i][j]) {
                    maxValue = arr[i][j];
                }
            }

        }

        return maxValue;
    }

    static int min(int[][] arr) {
        int minValue = arr[0][0];
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(minValue > arr[i][j]) {
                    minValue = arr[i][j];
                }
            }
        }

        return minValue;
    }

    /***************** Desc sort *********************/
    static int[][] incSort(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0 ; i < row; i++) {
            for (int m = 0 ; m < col-1; m++) {
                for (int n = m + 1; n < col; n++) {
                    if (arr[i][m] > arr[i][n]) {
                        int temp = arr[i][m];
                        arr[i][m] = arr[i][n];
                        arr[i][n] = temp;
                    }
                }
            }
        }

        return arr;
    }
}
