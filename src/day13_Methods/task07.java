package day13_Methods;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {

        System.out.println("Enter word: ");
        String word = new Scanner(System.in).next();

        System.out.println(title(word));

    }

    public static String title(String word1){

        return word1.trim().substring(0,1).toUpperCase() + word1.trim().toLowerCase().substring(1);
//        String word2 = word1.substring(0,1).toUpperCase();
//        word1 = word1.trim().toLowerCase().substring(1);
//
//        return word2 + word1;
    }

    //7. Create a method named title that takes a string arguments
    //
    //    The method returns the proper capitalized version of the given argument
    //
    //    Ex:
    //        title("jAvA") ===> Java
}
