package day22_ArrayList.tasks;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        String  str = "Wooden Spoon!";

        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        int j = 0;

        for (char i = ch[0]; i < ch.length; i++) {
            System.out.println(Character.isDigit(ch[j]));
            j++;


        }

    }

}

/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods

 */