package day15_loops;

import java.util.Scanner;

public class day15_task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter str: ");
//        String str = scan.nextLine();
//
//        System.out.println("Enter char: ");
//        char ch = scan.next().charAt(0);
//        int num = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == ch) {
//                num++;
//            }
//        }
//        System.out.println(num);
        /*
        3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
                */

//        System.out.println("--------------------------------------------");
//
//
//        System.out.println("Enter two positive numbers");
//        int num4 = scan.nextInt();
//        int num41 = scan.nextInt();
//        int result = 0;
//
//        while(num41 < num4) {
//                num4 -= num41;
//                result++;
//        }
//
//        System.out.println(result);



        /*
        4.  Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.



        */

//        System.out.println("Enter 2 numbers: ");
//        int num5 = scan.nextInt();
//        int num52 = scan.nextInt();
//        int result;
//
//        while(num5 >= 0 && num52 >= 0){
//
//            result = num5 + num52;
//            System.out.println(result);
//
//            System.out.println("Enter 2 numbers: ");
//            num5 = scan.nextInt();
//            num52 = scan.nextInt();
//
//        }

        /*

        5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

        */

//        System.out.println("Enter number greater than 1:");
//        int num6 = scan.nextInt();
//        String result1 = "";
//        String result2 = "";
//        String result3 = "";
//
//        for (int i = 1; i <= num6; i++) {
//            if(i % 15 == 0){
//
//                result1 += (i + " ");
//            }
//            if(i % 3 == 0 && i % 15 != 0){
//                result2 += (i + " ");
//            }
//            if(i % 5 == 0 && i % 15 != 0){
//                result3 += (i + " ");
//            }
//        }
//
//        System.out.println("Divisible by 15: " + result1);
//        System.out.println("Divisible by 5: " + result3);
//        System.out.println("Divisible by 3: " + result2);




        /*
        6. Create a class named DivisibleBy and Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15: 15 30 45 60 75 90

	                     Divisible By 5:  5 10 20 25 35 40 50 55 65 70 80 85 95 100

	                     Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

            */

//        System.out.println("Enter username and password: ");
//        String userName = scan.nextLine();
//        String password = scan.nextLine();
//
//        for (int i = 0; i < 3; i++) {
//
//            if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
//                System.out.println("Logged in");
//                break;
//            }
//            if ((!userName.equals("Cydeo") || !password.equals("Cydeo123")) && i < 2) {
//                    System.err.println("Wrong username/password combo. Try again: ");
//                    userName = scan.nextLine();
//                    password = scan.nextLine();
//
//            }else{
//                System.err.println("Your account is locked");
//
//            }
//        }

        /*

	     7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."

        */


//        System.out.println("Room?");
//        String answer;
//        String bedType = "";
//
//        while (true) {
//            answer = scan.nextLine();
//            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
//                System.err.println("Invalid answer. Say Yes/No:");
//                continue;
//            }
//            if (answer.equalsIgnoreCase("no")) {
//                System.out.println("have a nice day");
//                break;
//            }
//            if(answer.equalsIgnoreCase("yes")){
//                break;
//            }
//        }
//
//
//        if (answer.equalsIgnoreCase("yes")) {
//            System.out.println("Enter bed type:");
//
//            while (true) {
//                bedType = scan.nextLine();
//
//                if (!bedType.equalsIgnoreCase("King bed") && !bedType.equalsIgnoreCase("Queen bed") && !bedType.equalsIgnoreCase("Single bed")) {
//                    System.err.println("Invalid bed type. Try again:");
//                    continue;
//                } else if (bedType.equalsIgnoreCase("King bed")) {
//                    System.out.println("King bed: $120");
//                    break;
//                } else if (bedType.equalsIgnoreCase("queen bed")) {
//                    System.out.println("Queen bed: $100");
//                    break;
//                } else if(bedType.equalsIgnoreCase("queen bed")) {
//                    System.out.println("Single bed: $80");
//                    break;
//                }
//            }
//        }
        /*

Extra Spicy:

	    8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	    if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)


            */


        System.out.println("--------------------------------------------");



          String str = "aabcccd";

          String unique = "";

          for (int i = 0; i < str.length(); i++) { // i: index numbers of str
              char each = str.charAt(i);

              if (str.indexOf(each) == str.lastIndexOf(each)) {
                  unique += each;
              }

          }


          System.out.println(unique);


        /*

	    9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique

	    10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount

         */

    }
            }
