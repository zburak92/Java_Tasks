package day29_inheritence;

import java.util.Scanner;

public class asdf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int count1 = 0;
        int count2 = 0;

        for (int i = 0, j = 1, k = 2; k < str.length() ; i++, j++, k++){

            if (str.charAt(j) == str.charAt(k) && str.charAt(i) == str.charAt(j)) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
