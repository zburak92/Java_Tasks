package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radius, perimeter, area;

        System.out.println("Enter Radius");
        radius = scan.nextInt();
        scan.close();

        perimeter = 2*radius*Math.PI;
        area = Math.PI * (radius * radius);


        System.out.println("area = " + area);
        System.out.println("perimiter = " + perimeter);

        /*
        2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
         */
    }
}
