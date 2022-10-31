package day13_Methods;
import java.util.Scanner;
public class task01 {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        System.out.println(isOdd(num));

    }

    public static boolean isOdd(int num1){

        if(num1 % 2 == 0){
            return true;
        }
        return false;
    }
//1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false

}
