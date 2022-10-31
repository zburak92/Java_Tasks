package day11_StringMethods;

import java.util.Scanner;

public class WebsiteAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
            1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
        */

//        System.out.println("Enter website");
//        String webSite = input.next();
//
//        boolean isValidWebsite=false;
//
//        if (webSite.startsWith("www.") && (webSite.endsWith(".edu") || webSite.endsWith(".com") || webSite.endsWith(".gov"))){
//
//            isValidWebsite=true;
//        }
//
//        System.out.println("isValidWebsite = " + isValidWebsite);

//        System.out.println("------------------------------------------------------------------");


        /*
        2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */

//        System.out.println("Enter word");
//
//        String word = input.next();
//
//        if(word.startsWith("x")) {
//            word = word.replaceFirst("x", "a");
//        }
//
//        System.out.println(word);

//        System.out.println("------------------------------------------------------------------");


       /* 3. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
        Input:
        xcodeX
        Output:
        acodea
        */
//
//        System.out.println("Enter word3");
//        String word3 = input.next();
//
//        word3 = word3.replace("x","a").replace("X", "a");
//
//        System.out.println(word3);

//        System.out.println("------------------------------------------------------------------------");


        /*
        4. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
         */

//        System.out.println("Enter word4:");
//        String word4 = input.next();
//
//        if(word4.endsWith("ly")){
//            System.out.println("REALY?!?!?!!!");
//        }else {
//            System.out.println("NEVERMIND");
//        }

//        System.out.println("-----------------------------");

        /*
        5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */

//        System.out.println("ENter word51:");
//        String word51 = input.next().substring(1);
//        System.out.println("Enter word 52:");
//        String word52 = input.next().substring(1);
//
//        System.out.println(word51 + word52);

//        System.out.println("--------------------------------------------------------------");

        /*
        6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */

//        System.out.println("Enter word 61:");
//        String word61 = input.next();
//        System.out.println("Enter word 62:");
//        String word62 = input.next();
//
//        if(word61.charAt(word61.length()-1) == word62.charAt(0)){
//            word62 = word62.substring(1, word62.length());
//            System.out.println(word61 + word62);
//        }else{
//            System.out.println(word61+word62);
//        }

//
//        System.out.println("-----------------------------------------------------------");






        /*
        7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */


//        System.out.println("Enter first name:");
//        String firstName7 = input.next().toLowerCase();
//
//        System.out.println("Enter last name:");
//        String lastname7 = input.next().toLowerCase();
//
//        firstName7 = firstName7.substring(0, 1).toUpperCase() + firstName7.substring(1);
//        lastName7 = lastname7.substring(0, 1).toUpperCase() + firstName7.substring(1);
//
//        System.out.println(firstName71 + " " + lastName71);

//        System.out.println("---------------------------------------------------------------------");





        /*
        8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */

//        System.out.println("Enter Email");
//        String email8 = input.next();
//
//        int underScore = email8.indexOf('_');
//        int atSign = email8.indexOf('@');
//
//        if(email8.contains("_")){
//            String email81 = email8.substring(underScore+1, atSign) + "_" + email8.substring(0,underScore) + email8.substring(atSign);
//
//            System.out.println(email81);
//        }else{
//            System.out.println(email8);
//        }






        /*
        9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
         */


//        System.out.println("Enter your email");
//        String email = input.next().toLowerCase();
//
//        int underScore = email.indexOf("_");
//        int atSign = email.indexOf("@");
//        int period = email.lastIndexOf(".");
//
//        String firstName = email.substring(0,1).toUpperCase() + email.substring(1,underScore);
//        String lastName = email.substring(underScore+1,underScore+2).toUpperCase() + email.substring(underScore+2, atSign);
//        String domain = email.substring(atSign+1,period);
//
//        System.out.println("firstName = " + firstName);
//        System.out.println("lastName = " + lastName);
//        System.out.println("domain = " + domain);

        int hour;
        int minute;
        int second;
        String amOrPm = "";


        //DO NOT TOUCH BELOW LINES.
        Scanner sc = new Scanner(System.in);

        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:


        System.out.println(hour+":"+ minute +":"+ second + " " + amOrPm);


    }


}
