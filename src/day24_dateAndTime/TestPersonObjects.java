package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel,", 'M', LocalDate.of(1989, 2, 25));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        // print name & date of birth of each student
        //remove all students over 55


    }
}
