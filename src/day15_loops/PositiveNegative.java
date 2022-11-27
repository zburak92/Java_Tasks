package day15_loops;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, positive = 0, negative = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            num = input.nextInt();

            if (num > 0){ //1, 2,3,....
                positive++; // positive + 1
            }else if (num < 0) { // 0, -1, -2, -3
                negative++;
            }

        }

        System.out.println(positive + " numbers are positive " + negative + " numbers are negative");


    }

    /*
    2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
    Ex:
    Inputs:
            10
            20
            -1
            0
            3

    Output:
            3 positive and 1 negative
    */
}
