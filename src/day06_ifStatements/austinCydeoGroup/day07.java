package day06_ifStatements.austinCydeoGroup;

public class day07 {
    public static void main(String[] args) {



        String size = "tall";

        if(size == "tall" || size == "grande" || size == "venti"){
            if(size == "tall"){
                System.out.println("Price is $3.69\n90 calories");
            }else if(size == "grande"){
                System.out.println("Price is $3.99\n120 calories");
            }else{
                System.out.println("Price is $4.29\n150 calories");
            }
        }else{
            System.out.println("invalid size");
        }

//        String size ="";
//        double price=0;
//        int calory = 20;
//
//        if (size == "tall" || size == "grande" || size =="venti") {
//            if(size == "tall") {
//                price = 3.69;
//                calory = 90;
//            } else if (size== "grande") {
//                price = 3.99;
//                calory = 120;
//            } else {
//                price = 4.29;
//                calory = 150;
//            }
//
//        }else{
//            System.out.println("Invalid size");
//        }
//
//        System.out.println("price is: $" + price + "\n" + calory +" calories");



        /*
        1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if


2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


4. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

5. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


        */

        System.out.println("------------------------------------------");

        int number = 48;

        if(number % 3 == 0 || number % 5 == 0){

            if(number % 3 == 0 && number % 5 == 0){
                System.out.println("FINRA");

            }else if(number % 3 == 0){
                System.out.println("FIN");

            }else{
                System.out.println("RA");
            }

        }else{
            System.out.println(number);
        }

        /*

6. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA"
instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA

7. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
    }
}
