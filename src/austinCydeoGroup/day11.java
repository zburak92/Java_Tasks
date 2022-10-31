package austinCydeoGroup;

import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {


        String webSite = "www.google.com";

        if (webSite.startsWith("wwww.")) {
            System.out.println("Website is valid");
        } else if (webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".gov")) {
            System.out.println("Website valid");
        } else {
            System.out.println("invalid");
        }

        /*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

        */
        System.out.println("---------------------------------------------------");


        String word2 = "z-ray";

        if (word2.startsWith("x"))
            word2 = word2.replaceFirst("x", "a");

        System.out.println(word2);

        /*

2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex



3. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea


4. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

        */

        System.out.println("---------------------------------------");

        String word5_1 = "apple", word5_2 = "banana";

        System.out.println(word5_1.substring(1) + word5_2.substring(1));

        /*


5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

                */
        System.out.println("-----------------------------------------");

        String word6_1 = "one";
        String word6_2 = "eight";

        if (word6_1.charAt(word6_1.length() - 1) == word6_2.charAt(0)) {
            System.out.println(word6_1 + word6_2.substring(1));
        } else {
            System.out.println(word6_1 + word6_1);
        }


        /*

6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight


7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School


        */

        System.out.println("-----------------------------------------------------");

        String email = "mike_tyson@gmail.com";
        int index_ = email.indexOf("_"), index = email.indexOf("@");
        email = email.substring(index_ + 1, index) + "_" + email.substring(0, index_) + email.substring(index);

        System.out.println(email);


        /*

8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com



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
        System.out.println("------------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Split?");
        String split = scan.next();

        System.out.println("amount of people");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter check amount");
        double total, checkPerPerson, tip,
                check = scan.nextDouble();

        System.out.println("Service quality");
        String quality = scan.next();

        scan.close();

        switch (quality.toLowerCase()){
            case "poor":
                tip = 5;
                break;
            case "fair":
                tip = 10;
                break;
            case "good":
                tip = 15;
                break;
            case "great":
                tip = 20;
                break;
            case "excellent":
                tip = 25;
                break;
            default:
                tip = 0;
                break;
        }

        tip = check * tip / 100;
        total = check + tip;

        System.out.println("Total to pay: $" + total);
        System.out.println("Total tip: $" + tip);

        if(split.equalsIgnoreCase("yes")){
            checkPerPerson = total / numberOfPeople;
            tip /= numberOfPeople;
        }else{
            checkPerPerson = check + ((check * tip)/100);

        }

        System.out.println("Total per person: $" + checkPerPerson);
        System.out.println("Tip per person: $" + tip);


        /*
        Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

         */
    }
}
