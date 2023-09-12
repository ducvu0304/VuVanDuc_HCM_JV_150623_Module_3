import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearEquationResolver equation =  new LinearEquationResolver();
        DayOfMonth day = new DayOfMonth();

        // Given a equation : ax + b = c
        // System.out.println("Enter a:");
        // double a = Double.parseDouble(sc.nextLine());
        // System.out.println("Enter b:");
        // double b = Double.parseDouble(sc.nextLine());
        // System.out.println("Enter c:");
        // double c = Double.parseDouble(sc.nextLine());

        // DayOfMonth
        System.out.println("Enter Month:");
        int month = sc.nextInt();
        day.getDayOfMonth(month);
    }
}