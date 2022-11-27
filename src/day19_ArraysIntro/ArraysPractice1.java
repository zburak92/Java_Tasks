package day19_ArraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String myGroup[] = new String [5];

        for (int i = 0; i < myGroup.length; i++) {

            System.out.println("Enter group mate name:");

            myGroup[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(myGroup));



    }

}
