package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class RoomMates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int people;
        String result = "Live with ";

        System.out.println("Enter number of roommates:");

        people = scan.nextInt();

        if(people < 3){
            result += "less than 3 people";
        }else if(people >= 3 && people <= 6){
            result += "3 - 6 people";
        }else{
            result += "more than 6 people";
        }

        System.out.println(result);

        scan.close();

        /*
        1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
         */
    }
}
