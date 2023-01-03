package day25_Constructors.tasks;

public class Carpet {

    int width, length, unitPrice;
    boolean isPersian;

    public Carpet(int width, int length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public int calcCost(){
        if(isPersian)
            return (width*length) * unitPrice + 200;

        return (width * length) * unitPrice;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", calcCost=" + calcCost() +
                '}';
    }
}

class TestCarpet{
    public static void main(String[] args) {
        System.out.println(new Carpet(40, 60, 5, true));
    }
}

/*
Task03:
    1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */
