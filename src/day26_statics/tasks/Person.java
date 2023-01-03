package day26_statics.tasks;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean canBreath = true;
    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

class PersonTest{
    public static void main(String[] args) {

        Person person1 = new Person("Burak", 30, 'M');

        System.out.println(person1);
        System.out.println(person1.numberOfHead);
        System.out.println(person1.numberOfEyes);


        Person person2 = new Person("Hulya", 28, 'F');

        System.out.println(person2);
        System.out.println(person2.numberOfHead);
        System.out.println(person2.numberOfEyes);


    }
}

/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */
