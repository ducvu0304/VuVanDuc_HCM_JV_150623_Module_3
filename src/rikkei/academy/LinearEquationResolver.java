package rikkei.academy;

public class LinearEquationResolver {
    // Given a equation : ax + b = c
    public void calculation (double a, double b, double c) {
        double x;
        if(a != 0 ) {
          x = (c-b)/a;
            System.out.println("Equation pass with x: " + x);
        }else {
            if(b == c) {
                System.out.println("The solution is all");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
