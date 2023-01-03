package day30_inheritence.typesofinheritence;

import java.time.LocalDate;

public class Student extends Person {
    private char grade;
    private String studentID;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentID) {
        super(name, gender, DOB);
        setGender(gender);
        setStudentID(studentID);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName() + " is studying");

    }
}
