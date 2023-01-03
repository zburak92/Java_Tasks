package day24_dateAndTime.tasks;

import java.time.LocalDate;

public class Task8 {
    public static void main(String[] args) {

        System.out.println(leapYear(1992));

    }

    public static boolean leapYear(int birthYear){

        return LocalDate.of(birthYear,1,1).isLeapYear();

    }


}

/*
8. Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
 */
