package imp;

import entity.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QuadraticEquation equation = new QuadraticEquation();
        equation.inputData(scanner);
        equation.getDiscriminant();
    }
}
