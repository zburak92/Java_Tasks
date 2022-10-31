package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String prodName;
        double price;
        int quantity;
        String firstName;

        System.out.println("Enter Product Name:");
        prodName = scan.nextLine();

        System.out.println("Enter Price:");
        price = scan.nextDouble();

        System.out.println("Enter Quantity:");
        quantity = scan.nextInt();

        System.out.println("Enter first name:");
        firstName = scan.next();

        System.out.println(firstName + ", your order for " + quantity + " " + prodName + " has been placed. Your total is $" + price);

        scan.close();


        /*
        7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

         */
    }
}
