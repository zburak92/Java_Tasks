package day26_statics.tasks;

public class CydeoStudent {

    String name, id;
    int age, batchNumber, groupNumber;
    char gender, grade;

    static String schoolName = "Cydeo School", magicWord = "Wooden Spoon";

    public CydeoStudent(String name, String id, int age, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is in class");
    }

    public static void printSchoolName(){
        System.out.println("At the school: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language " + magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

class TestStudent{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Burak", "A04009443", 30, 28, 4, 'M', 'A');

        student1.attendClass();
        student1.study();


        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolName();
    }
}

/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */
