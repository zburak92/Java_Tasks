package day19_ArraysIntro;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        
        int arr1[] = new int[100];

//        for (int i = 0, j=1; i < arr1.length; i++, j++) {
//            arr1[i] = j;
//        }
//                      or

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr1));


        int arr2[] = new int[100];

        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = i + 1;
//          System.out.print((arr2[i] = i + 1) + ", ");      ------------> this will reverse the print order... 100, 99, ..... 1
        }

        System.out.println(Arrays.toString(arr2));       // -----------> this will still print 1 to 100 because "Arrays.toString(arr2) it still rearranges it before printing

    }
    
}
