package day24_dateAndTime.tasks;


import java.util.ArrayList;
import java.util.Arrays;


public class Task6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Faridaamka"));

        list.removeIf(p -> p.length() >= 10);

        System.out.println(list);


    }
}

/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
 */