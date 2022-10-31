package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount in pennies:");

        int cents = scan.nextInt();
        int cents2 = cents;
        int dollars;

        scan.close();

        dollars = cents / 100;
        cents2 %= 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + cents2 + " cents");



    /*
    5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
     */
    }
}
