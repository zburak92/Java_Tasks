package day21_multiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int arr1[] = {10,20,30};
        int arr2[] = {40, 50, 60, 70, 80};
        int arr3[] = {90, 100};

        System.out.println("-------------------");

        int arr2D[][] = {arr1, arr2, arr3};

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][3]);

        System.out.println(Arrays.deepToString(arr2D));

    }

}
