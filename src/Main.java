import rikkei.academy.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        int width = scanner.nextInt();
        System.out.print("Enter the height:");
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        int perimeterRectangle =  rectangle.getPerimeter();
        int areaRectangle=  rectangle.getArea();

        System.out.println("Your Rectangle: \n" +  rectangle.display());
        System.out.printf("Perimeter of the Rectangle: %d\n", perimeterRectangle);
        System.out.printf("Area of the Rectangle: %d\n", areaRectangle);

    }
}