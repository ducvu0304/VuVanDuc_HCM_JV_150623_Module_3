package rikkei.academy;
import java.lang.Math;
public class BMI {
    public void getBMI(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);

        if(bmi < 18) System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if(bmi < 25.0) System.out.printf("%-20.2f%s", bmi, "Normal");
        else if(bmi < 30.0) System.out.printf("%-20.2f%s", bmi, "Overweight");
        else System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
