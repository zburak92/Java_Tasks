package day27_accessModifier;

public class Circle {

    public double radius, diameter;

    public static double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = 2 * radius;

    }


    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return diameter * pi;
    }

    public static void printPiValue(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
