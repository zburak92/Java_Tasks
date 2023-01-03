package day28_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size == null){
            System.err.println("Size cannot be null");
            System.exit(1);
        }


        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.err.println("Invalid size: " + size);
            System.exit(1);
        }


        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if ((size.equalsIgnoreCase("small") && numberOfCheeseToppings > 3 || numberOfCheeseToppings < 0) || (size.equalsIgnoreCase("medium") && numberOfCheeseToppings > 4 || numberOfCheeseToppings < 0)
                || (size.equalsIgnoreCase("large") && numberOfCheeseToppings > 5 || numberOfCheeseToppings < 0)) {
            System.err.println("Too many cheese toppings for size " + size);
            System.exit(1);
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if ((size.equalsIgnoreCase("small") && numberOfPepperoniToppings > 4 || numberOfPepperoniToppings < 0) || (size.equalsIgnoreCase("medium") && numberOfPepperoniToppings > 5 || numberOfPepperoniToppings < 0)
                || (size.equalsIgnoreCase("large") && numberOfPepperoniToppings > 6 || numberOfPepperoniToppings < 0)) {
            System.err.println("Too many pepperoni toppings for size " + size);
            System.exit(1);
        }

        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){
        double statingPrice = (size.equalsIgnoreCase("small")) ? 10 :(size.equalsIgnoreCase("medium"))? 12 : 14;
        double totalPrice = statingPrice + 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseToppings +
                ", numberOfPepperoniTopping=" + numberOfPepperoniToppings +
                ", total price=" + calcCost() +
                '}';
    }


}

class TestPizza{
    public static void main(String[] args) {
        Pizza pizza = new Pizza("small", 2, 3);

        System.out.println(pizza);
    }
}


/*
4. Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping
                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive
                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5
                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
                                        small: 4
                                        medium: 5
                                        large: 6
                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)
                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */