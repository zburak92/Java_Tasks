package day31_inheritance.animal_methodOverriding;

public class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat(){
        System.out.println("Cat " + getName() + " is eating Cat food");
    }

    public void sleep(){
        System.out.println("Cat" + getName() + " sleeps 12 hours in a day");

    }


}
