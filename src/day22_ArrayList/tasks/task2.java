package day22_ArrayList.tasks;

import java.util.Arrays;

public class task2 {

    public static int[] replace(int[] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        arr = replace(arr, 30, 300);

        System.out.println(Arrays.toString(arr));
    }

}
/*
2. ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
 */
