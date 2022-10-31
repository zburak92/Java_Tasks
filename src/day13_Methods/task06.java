package day13_Methods;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");
        String sentence = new Scanner(System.in).nextLine();

        System.out.println("Enter a word to get frequency: ");
        String word = new Scanner(System.in).next();

        System.out.println(frequencyOfWord(sentence, word));

    }

    public static int frequencyOfWord(String str1, String str2){

        String str = str1.toLowerCase().replace(str2.toLowerCase(), "");

        return (str1.length()-str.length())/str2.length();


//6. Create a method named frequencyOfWord that takes two arguments:
//            1. sentence (String)
//            2. word (String)
//
//    The method should return the frequency of the word from the sentence
//
//        Ex:
//            frequencyOfWord("Java java jAvA", "java")  ==> 4
    }
}
