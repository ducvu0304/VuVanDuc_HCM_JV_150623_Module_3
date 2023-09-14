package rikkei.academy;

import java.util.Scanner;

public class OperatorExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width, height, area;

        System.out.println("Enter width: ");
        width = sc.nextFloat();

        System.out.println("Enter height: ");
        height = sc.nextFloat();

        area = width * height;
        System.out.println("Area is : " + area); // In ra kết quả diện tích của hình
    }
}
