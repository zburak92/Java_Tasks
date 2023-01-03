package day20_arraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class day20_tasks {
    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String[] arr = str.split(", ");

        int smallest=arr[0].length();//5

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<smallest){
                smallest=arr[i].length();
            }
        }

        int i=0;
        for (String each : arr) {
            if (each.length()==smallest){
                i++;
            }
        }

        String[] newArr=new String[i];

        int j=0;
        for (String each : arr) {
            if (each.length()==smallest){
                newArr[j++]=each;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }






        /*


        1. Write a program that can reverse the second word of the sentence
        Ex:
        sentence = "I Love Java";

        output:
        I evoL Java


        2.  Write a program that can count the even and odd number from an array of integers

        Note: MUST use for each loop

        3. Write a program that can print out the common elements from two integer array
        Ex:
        arr1: {1,2,3,4,5}
        arr2: {4,5,6,7,8}

        output:
        4 5


        MUST use for each loops


        4. write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};

        output:
        2

        5. Write a program that can display the unique elements of an array

        MUST use for each loops

                */

}
