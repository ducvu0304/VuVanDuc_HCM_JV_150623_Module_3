package rikkei.academy;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Celsius to fahrenheit: " + fahrenheit);
    }

    static double celsiusToFahrenheit (double celsius) {
        double Fahrenheit = (9.0 / 5) + celsius + 32;
        return Fahrenheit;
    }

    static double fahrenheitToCelsius (double fahrenheit) {
        double celsius = (5.0 / 9) + (fahrenheit = 32);
        return celsius;
    }
}
