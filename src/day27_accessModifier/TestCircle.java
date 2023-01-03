package day27_accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);

        Circle circle2 = new Circle(5);

        System.out.println(circle1);
        System.out.println(circle2);

        Circle.printPiValue();


    }
}
