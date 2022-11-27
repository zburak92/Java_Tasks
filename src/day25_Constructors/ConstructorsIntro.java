package day25_Constructors;

public class ConstructorsIntro {


    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument constructor");

    }

    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int argument constructor" + a);

    }

    public void add(){

    }

    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro();

        ConstructorsIntro obj2 = new ConstructorsIntro(10);

        ConstructorsIntro obj3 = new ConstructorsIntro(20);


    }


}
