package day22_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        int min = list.get(0);
        int max = list.get(0);

        for (int each : list) {
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}

/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */
