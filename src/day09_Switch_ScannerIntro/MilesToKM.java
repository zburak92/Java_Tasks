package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles:");

        double KM, miles = scan.nextDouble();

        KM = miles * 1.609;

        System.out.println(miles + " miles equal to " + KM + " kilometers");

        scan.close();

        /*
        6. Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilome
         */
    }
}
