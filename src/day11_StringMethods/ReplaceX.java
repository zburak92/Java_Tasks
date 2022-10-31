package day11_StringMethods;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        /*
           3. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */

        Scanner input = new Scanner(System.in);


        System.out.println("enter");
        String word = input.next();
        word = word.toLowerCase();

        if (word.contains("x")) {
            word = word.replace("x", "a");
            System.out.println(word);
        } else {
            System.out.println(word);
        }

        System.out.println("-----------------------------------------------------------");



        /*
        ReallyNeverMind
        4. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
         */

        System.out.println("Enter a word");
        String word2 = input.next();

        if(word2.toLowerCase().endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Nevermind");
        }



        System.out.println("-----------------------------------------------------------");



        /*
        WithoutFirstChar
        5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */

        System.out.println("Enter 2 words");
        String word3 = input.next();
        String word4 = input.next();

        word3 = word3.substring(1);
        word4 = word4.substring(1);

        System.out.println(word3 + word4);


        System.out.println("-----------------------------------------------------------");



        /*
        CombineWords
        6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */

        System.out.println("Enter two words");
        String word5 = input.next();
        String word6 = input.next();

        int first = word5.length() - 1 ;

        if(word5.charAt(first) == word6.charAt(0)){

            System.out.println(word5 + word6.substring(1));

        }else{

            System.out.println(word5+word6);

        }


        System.out.println("-----------------------------------------------------------");




        /*
             7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */

        System.out.println("Enter 2 full name");
        String firstName = input.next();
        String lastName = input.next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

        System.out.println("-----------------------------------------------------------");





        /*
        EmailTask1
        8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */

        String email = "mike_tyson@gmail.com";

        int underscoreIndex = email.indexOf("_");//4
        int atChar = email.indexOf("@"); //11


        if (email.contains("_")) {

            String first1 = email.substring(0, underscoreIndex);
            String second = email.substring(underscoreIndex + 1, atChar);
            String domain = email.substring(atChar);

            System.out.println(second + "_" + first1 + domain);

        }else{
            System.out.println(email);
        }


        System.out.println("-----------------------------------------------------------");




        /*
        EmailTask2
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

        String email2 = "craig_federighi@apple.com";
        int underScore2 = email2.indexOf("_");
        int atSign2 = email2.indexOf("@");
        int period = email2.lastIndexOf(".");

        String firstName2 = email2.substring(0,1).toUpperCase() + email2.substring(1,underScore2).toLowerCase();
        String lastName2 = email2.substring(underScore2 + 1, underScore2 + 2).toUpperCase() + email2.substring(underScore2 + 2, atSign2).toLowerCase();
        String domain = email2.substring(atSign2 + 1, atSign2 + 2).toUpperCase() + email2.substring(atSign2 + 2, period).toLowerCase();


        System.out.println("first name: " + firstName2);
        System.out.println("last name: " + lastName2);
        System.out.println("domain = " + domain);

        System.out.println("-----------------------------------------------------------");




    }

}
