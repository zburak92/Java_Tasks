package austinCydeoGroup;

public class day04_task1 {
    public static void main(String[] args) {


        int countryCode = 1, areaCode = 703, localNumber = 451625;

        System.out.println("+" + countryCode + "(" + areaCode + ")-" + localNumber);

        /*
        1. create a class named PhoneNumber and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625

          */
        System.out.println("-----------------------------------------------");

        String name = "John", birthMonth = "April";
        int birthDay = 25, birthYear = 1995;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);


        /*

2. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.


           */

        System.out.println("------------------------------------------");


        double kg = 10.5, lb;

        lb = kg * 2.2;

        System.out.println(kg + " kilos is equal to " + lb + " pounds");




        /*


3. Create a class named KilosToPounds and declare the following variables:
                kg
                lb

    3.1 Write a program that can convert the any given number of kilos to pounds
        Ex:
              kg = 10.5

        output:
              10.5 kilos is equal to 23.1 pounds

           Hint:  1kg = 2.2 lb


         */
        System.out.println("--------------------------------");



        double gallon = 10, liters;

        liters = gallon * 3.79;

        System.out.println(gallon + " gallons is equal to " + liters + " liters");



        /*
4. Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert the any given number of gallons to liters
        Ex:
              gallon = 10

        output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L


           */
        System.out.println("---------------------------------------------");


        int side = 5, area = side*side, perimeter = side * 4;

        System.out.println("Area of the square is " + area + "\nPerimeter of the square is " + perimeter);



            /*
5. Create a class named Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               Area of the square is 25
               Perimeter of the square is 20

               */
        System.out.println("----------------------------------");

        double radius = 5, areaCirc = Math.PI * radius * radius, perimeterCirc = 2 * Math.PI * radius;

        System.out.println("Area of the circle is " + Math.round(areaCirc) +  "\nPerimeter of the circle is " +
                Math.round(perimeterCirc));


        /*


6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4



           */
        System.out.println("---------------------------------------");


        int hourlyRate = 50, weeklyHours = 45, stateTaxRate = 6, federalTaxRate = 26, salaryBeforeTax,
                stateTax, federalTax, totalTax, salaryAfterTax;

        salaryBeforeTax = hourlyRate * weeklyHours * 52;
        stateTax = stateTaxRate * salaryBeforeTax / 100;
        federalTax = federalTaxRate * salaryBeforeTax / 100;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: " + salaryBeforeTax);
        System.out.println("Federal tax is: " + federalTax);
        System.out.println("State tax is: " + stateTax);
        System.out.println("Total tax is: " + totalTax);
        System.out.println("Net income is: " + salaryAfterTax);


        /*
7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560


            */

        System.out.println("--------------------------------------------");

        int x = 15, y = 10, z;

        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*


8. Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10

           */
        System.out.println("-------------------------------------------");

        int x2 = 10, y2 = 15;



        x2 = x2 + y2; //x2 = 25
        y2 = x2 - y2; //y2 = 10
        x2 = x2 - y2; //x2 = 15

        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);

        /*


9. Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
         */

    }
}
