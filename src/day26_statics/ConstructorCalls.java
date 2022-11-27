package day26_statics;

import java.lang.reflect.Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default constructor");

    }

    public ConstructorCalls(int a){
        this(); // calls ConstructorCalls() constructor. this(); ony calls from one constructor to another constructor and must be called at the first line
        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this();
        //this(2.5); constructor can only call one other constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        method1();

        System.out.println("------------------------------------");

        method2();

        System.out.println("--------------------------------------");

    }
    public static void method1(){
        System.out.println("Method 1");


    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

}
