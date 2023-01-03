package day24_dateAndTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        list.removeAll(Arrays.asList(Collections.max(list)));
        list.removeAll(Arrays.asList(Collections.min(list)));

        System.out.println(Arrays.asList(Collections.max(list)));
        System.out.println(Arrays.asList(Collections.min(list)));

    }


}

/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */
