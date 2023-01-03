package day25_Constructors.tasks;

public class Pizza {

    String size;
    int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){
        if(size.equalsIgnoreCase("Small"))
            return 10 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
        else if(size.equalsIgnoreCase("Medium"))
            return 12 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
        else if (size.equalsIgnoreCase("Large"))
            return 14 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
        else
            return 0;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Cost: " + calcCost() +
                '}';
    }
}

class TestPizza{
    public static void main(String[] args) {

        System.out.println(new Pizza("Large", 4, 2));

    }
}

/*
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping,
            and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */