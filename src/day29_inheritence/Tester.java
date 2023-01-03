package day29_inheritence;

public class Tester extends Employee {

    public Tester(String name, String id, String jobTitle, int age, int salary, char gender) {
        super(name, id, jobTitle, age, salary, gender);
    }

    public void testing(){
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

}
