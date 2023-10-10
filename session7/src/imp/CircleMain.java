package imp;

import entity.Circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(3.7, "Red");
        circle.calArea();
        circle.calPerimeter();
        circle.displayData();

        // Circle1
        Circle circle1 = new Circle();
        circle1.inputData(scanner);
        circle1.calPerimeter();
        circle1.calArea();
        circle1.displayData();
    }
}
