package day16_doWhileAndNestedLoops;

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String star = "*";
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(star + " ");
//            }
//            System.out.println();
//        }

        /*
        1. Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
         */

//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 11; j++) {
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
//        }

        /*
        2. Create a class called MultiplicationTable, Write a program that can display the multiplication table:

                        1       2       3       4       5       6       7       8       9       10
                        2       4       6       8       10      12      14      16      18      20
                        3       6       9       12      15      18      21      24      27      30
                        4       8       12      16      20      24      28      32      36      40
                        5       10      15      20      25      30      35      40      45      50
                        6       12      18      24      30      36      42      48      54      60
                        7       14      21      28      35      42      49      56      63      70
                        8       16      24      32      40      48      56      64      72      80
                        9       18      27      36      45      54      63      72      81      90
                        10      20      30      40      50      60      70      80      90      100
         */


//        for (char i = 'A'; i <= 'E'; i++) {
//
//            for (char j = 'a'; j <= 'z'; j++) {
//                System.out.print("" + i + j + " ");
//            }
//            System.out.println();
//        }

        /*

        3. Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez
         */

//        String reEnter;
//
//        do{
//            System.out.println("Enter the radius of the circle:");
//            int radius = scan.nextInt();
//            scan.nextLine();
//
//            if(radius < 1){
//                System.err.println("Invalid Entry for the radius of the circle");
//                System.exit(1);
//            }
//
//            System.out.println("Diameter of circle: " + radius * 2);
//            System.out.println("Area of the circle: " + radius * radius * 3.14);
//            System.out.println("Perimeter of the circle: " + 2 * 3.14 * radius);
//
//            System.out.println("Would you like to calculate another circle?");
//            reEnter = scan.nextLine();
//
//                while(!(reEnter.equalsIgnoreCase("yes") || reEnter.equalsIgnoreCase("no"))){
//                    System.err.println("Invalid entry. Please say yes/no: ");
//                    reEnter = scan.nextLine();
//            }
//                if(reEnter.equalsIgnoreCase("no"))
//                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
//
//        }while(reEnter.equalsIgnoreCase("yes"));

        /*

          4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

     */
//
//        String result = "", str = "aabcccd";
//        char letter = ' ';
//
//
//        for (int i = 0; i < str.length(); i++) {
//            letter = str.charAt(i);
//            int count = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//                char letter2 = str.charAt(j);
//
//                if (letter == letter2)
//                    count++;
//
//            }
//
//            if (!(result.contains(letter + ""))) {
//                result += "" + letter + count;
//            }
//
//        }
//        System.out.println(result);

        /*
        9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
         */

//        String result = "", str = "aabccdeef";
//        char ch = ' ';
//
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0;
//            ch = str.charAt(i);
//
//            for (int j = 0; j < str.length(); j++) {
//                char ch2 = str.charAt(j);
//
//                if(ch == ch2){
//                    count++;
//                }
//
//            }
//           if(count == 1){
//               result += "" +ch;
//           }
//        }
//
//        System.out.println(result);


        /*
        10. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique

         */

    }
}


