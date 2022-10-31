package day13_Methods;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        System.out.println("Number is even: " + isEven(num));


    }

    public static boolean isEven(int num1){

        if(num1 % 2 == 1){
            return true;
        }
        return false;
    }
//2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false
}
