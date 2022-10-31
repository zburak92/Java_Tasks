package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter operator:");
        char operator = scan.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            System.out.println("Enter second number:");
            double num2 = scan.nextDouble();

            switch (operator) {
                case '+':
                    num1 += num2;
                    break;
                case '-':
                    num1 -= num2;
                    break;
                case '*':
                    num1 *= num2;
                    break;
                case '/':
                    num1 /= num2;
                    break;
            }

            System.out.println(num1);

        } else {
            System.out.println("Invalid Entry");
        }

        scan.close();

        /*
       9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
         */
    }
}
