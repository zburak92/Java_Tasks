package day21_multiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;

        String groups [][] = {group1, group2, group3, group4};


        for (String[] group : groups) {
            System.out.println(Arrays.toString(group));
            for (String eachName : group) {
                System.out.print(eachName + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String eachGroup[] = groups[i];
            System.out.println(Arrays.toString(groups[i]));
            for (int i1 = eachGroup.length - 1; i1 >= 0; i1--) {

                System.out.print(groups[i][i1] + " ");

            }
            System.out.println();

        }

        System.out.println("-------------------------------------------------------------------------------------------");



    }

}
