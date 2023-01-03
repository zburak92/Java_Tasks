package day29_inheritence;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee{

    private String programmingLanguage;


    public Developer(String name, String id, String jobTitle, int age, int salary, char gender, String programmingLanguage) {
        super(name, id, jobTitle, age, salary, gender);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if (!list.contains(programmingLanguage)) {
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void coding(){
        System.out.println("Coding using: " + programmingLanguage);
    }

}
