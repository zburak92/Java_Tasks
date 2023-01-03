package day29_inheritence;

public class Employee {
    private String name, id, jobTitle;
    private int age, salary;
    private char gender;

    public Employee(String name, String id, String jobTitle, int age, int salary, char gender) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setAge(age);
        setSalary(salary);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.err.println("Age cannot be negative");
            System.exit(1);
        }

        if(age < 16 || age > 65){
            System.err.println("Invalid age");
            System.exit(1);

        }
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary < 0){
            System.err.println("Invalid salary");
            System.exit(1);

        }
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid Gender");
            System.exit(1);
        }
        this.gender = gender;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
