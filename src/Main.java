import rikkei.academy.BMI;
import rikkei.academy.DayOfMonth;
import rikkei.academy.LeapYear;
import rikkei.academy.LinearEquationResolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearEquationResolver equation =  new LinearEquationResolver();
        DayOfMonth day = new DayOfMonth();
        LeapYear leapYear = new  LeapYear();
        BMI bmi = new BMI();

        // ================= "Given a equation : ax + b = c " =================

//         System.out.println("Enter a:");
//         double a = Double.parseDouble(sc.nextLine());
//         System.out.println("Enter b:");
//         double b = Double.parseDouble(sc.nextLine());
//         System.out.println("Enter c:");
//         double c = Double.parseDouble(sc.nextLine());

        //  ==================="Get Day of month"==================

        // System.out.println("Enter Month:");
        // int month = sc.nextInt();
        // day.getDayOfMonth(month);

        //  ==================="Check leap-year"==================

        // System.out.println("Enter Year:");
        // int year = sc.nextInt();
        // leapYear.CheckLeapYear(year);

        //  ==================="Body weight"==================

        double weight, height;
        System.out.println("Your weight (in kilogram)");
        weight = sc.nextDouble();

        System.out.println("Your height (in meter)");
        height = sc.nextDouble();
        bmi.getBMI(weight, height);
    }
}