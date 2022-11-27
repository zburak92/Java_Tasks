package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dob;

    public void setInfo(String name, char gender, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;

        this.age = LocalDate.now().getYear() - dob.getYear();

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }
}
