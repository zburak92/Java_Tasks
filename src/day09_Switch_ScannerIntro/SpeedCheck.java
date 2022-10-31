package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

    int speedLimit, speed;

    Scanner scan = new Scanner(System.in);

        System.out.println("Enter current speed:");
        speed = scan.nextInt();

        System.out.println("Enter Speed Limit:");
        speedLimit = scan.nextInt();

        if (speed > speedLimit){
            speed -= speedLimit;
            System.out.println("You are going "+ speed + " mph over the limit. Slow Down!");
        }

        scan.close();
        /*
        4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
         */
    }
}
