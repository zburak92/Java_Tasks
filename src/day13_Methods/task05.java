package day13_Methods;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {

        System.out.println("Enter 1st word: ");
        String str1 = new Scanner(System.in).next();
        System.out.println("Enter 2nd word: ");
        String str2 = new Scanner(System.in).next();

        System.out.println("Word combination: " + combine(str1, str2));

    }

    public static String combine(String word1, String word2){

        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            word1 = (word1.substring(0, word1.length()-1) + word2);
            return word1;
        }else{
            return word1+word2;
        }


//5.  Create a method named combine that can take two string and hen add them together and returns it.
//        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
//    Ex:
//        combine("one", "eight")  ==> oneight
    }
}
