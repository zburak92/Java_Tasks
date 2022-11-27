package day15_loops;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = input.nextLine();

        while ( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.out.println("Invalid answer. Please re-enter: ");
            answer = input.nextLine();

        }

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Congrats!");

        } else {
            System.out.println("Goodbye");

        }

        input.close();
    /*
    1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
     */

    }
}
