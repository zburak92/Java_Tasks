package day22_ArrayList.tasks;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        String str = "Wooden Spoon!1";
        String letter = "", digit = "", specialChar = "";

        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {
                digit += each + "";

            }else if(Character.isLetter(each)){
                letter += each + "";
            }else{
                specialChar += each + "";
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("digit= " + digit);
        System.out.println("SpecialChar= " + specialChar);

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