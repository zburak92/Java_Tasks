package day25_Constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {
        Employee e1 = new Employee("Burak", 30, 'M', "SDET", 135000, LocalDate.of(2022, 4, 20));

        Employee e2 = new Employee("Hulya", 28, 'F', "SDET", 127000, LocalDate.of(2022, 7, 8));

        System.out.println(e1);
        System.out.println(e2);
    }
}
