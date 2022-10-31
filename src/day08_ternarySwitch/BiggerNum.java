package day08_ternarySwitch;

public class BiggerNum {
    public static void main(String[] args) {

        int n1 = 9;
        int n2 = 10;
        int n3 = 7;

        String result = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "N2 is bigger" : "N3 is bigger";

        System.out.println(result);


        /*
        6. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
         */
    }
}
