package entity;

import java.util.Scanner;

public class Circle {
    private static final double PI = 3.14;
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    public void calPerimeter() {
        System.out.printf("Perimeter: %.2f\n", radius*2*PI);
    }

    public void calArea() {
        System.out.printf("Area: %.2f\n", Math.pow(radius,2 )*PI);
    }

    public void inputData(Scanner scanner) {
        System.out.println("Enter radius");
        this.radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter color");
        this.color = scanner.nextLine();
    }

    public void displayData() {
        System.out.printf("Radius: %.2f\n" +
                          "Color: %s", this.radius, this.color );
    }
}
