package day08_ternarySwitch;

public class OxygenTank {

    public static void main(String[] args) {

        int num = 40;
        String result = (num >= 90) ? "Your tank is full" : (num >= 80 && num < 90) ? "Still ok" :
                (num >= 70 && num < 80) ? "Don't go too far" : (num >= 60 && num < 70) ? "Start to head back"
                        : (num >= 50 && num < 60) ? "Be careful now, youre at 50%" : "You're gonna die";

        System.out.println(result);
        /*
        4. Create a class called OxygenTank. You are diving in the ocean.
        Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too fa4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternaryr
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
         */
    }

}
