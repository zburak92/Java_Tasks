package day13_Methods;

import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");

        double num1 = new Scanner(System.in).nextDouble();
        double num2 = new Scanner(System.in).nextDouble();
        System.out.println("Maximum number is: " + numberMax(num1, num2));

    }

    public static double numberMax(double n1, double n2){

        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }

    }
//3. Create a method named max, that can return the maximum number between two numbers
}
