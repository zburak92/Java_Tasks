package day17_customClass;

import day17_customClass.Dog;

import java.util.Scanner;

public class TaskDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Scanner input = new Scanner(System.in);

        System.out.println("What's your dogs name?");
        dog1.name = input.next();
        input.nextLine();
        System.out.println("Whats your dogs breed?");
        dog1.breed = input.nextLine();
        System.out.println("Whats the size of your dog?");
        dog1.size = input.next();
        System.out.println("Whats your dogs gender?");
        dog1.gender = input.next().charAt(0);
        System.out.println("Whats your dogs age?");
        dog1.age = input.nextInt();
        System.out.println("Whats your dogs color?");
        dog1.color = input.next();

        System.out.println(dog1); // prints what is returned from toString method in "Dog" class

        Dog dog2 = new Dog();

        System.out.println("What's your dogs name?");
        dog2.name = input.next();
        input.nextLine();
        System.out.println("Whats your dogs breed?");
        dog2.breed = input.nextLine();
        System.out.println("Whats the size of your dog?");
        dog2.size = input.next();
        System.out.println("Whats your dogs gender?");
        dog2.gender = input.next().charAt(0);
        System.out.println("Whats your dogs age?");
        dog2.age = input.nextInt();
        System.out.println("Whats your dogs color?");
        dog2.color = input.next();

        System.out.println(dog2);

        Dog dog3 = new Dog(); // create "setInfo" method in Dog class

        dog3.setInfo("Loki", "Chow Chow", 'M', 3, "large", "black");
        System.out.println(dog3);

        dog3.eat();

        dog1.drink();


    }
}
