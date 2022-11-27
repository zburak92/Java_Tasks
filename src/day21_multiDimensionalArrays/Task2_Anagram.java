package day21_multiDimensionalArrays;

import java.util.Arrays;

public class Task2_Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        String a1[] = str1.split("");
        String a2[] = str1.split("");
        // or
        char a3[] = str1.toCharArray();
        char a4[] = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));

        System.out.println(Arrays.toString(a2));

        boolean isAnagram = Arrays.equals(a1, a2);

        System.out.println(isAnagram);
    }

}
