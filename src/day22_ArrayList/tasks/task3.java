package day22_ArrayList.tasks;

import java.sql.Array;
import java.util.Arrays;

public class task3 {

    public static int[] insert(int[] array, int index, int element){
        int[] newArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            if(i == index){
               newArray[i] = element;
            }
            if(i >= index) {
                newArray[i + 1] += array[i];
            }
            if(i < index){
                newArray[i] += array[i];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        arr = insert(arr, 2, 100);
        System.out.println(Arrays.toString(arr));
    }

}
/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */
