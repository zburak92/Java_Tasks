package day19_ArraysIntro;

import java.util.Arrays;

public class day19_Tasks {
    public static void main(String[] args) {

//        String names[] = {"Hulya Keles", "Burak Zeybek", "Aysegul Zeybek", "Melis Keles", "Nuri Karayigit", "Asiye Baki", "Ali Sabanci", "Tugba Baki", "Fehim Skrebo", "Chris Vasquez"};
//
//        String result [] = new String[names.length];
//
//        for (int i = 0; i < names.length; i++) {
//            result[i] = names[i].substring(0,1) + "." + names[i].substring(names[i].indexOf(' ') + 1, names[i].indexOf(' ') + 2) + ".";
//            //System.out.print(names[i].substring(0,1) + "." + names[i].substring(names[i].indexOf(' ') + 1, names[i].indexOf(' ') + 2) + ". ");
//        }
//
//       System.out.println(Arrays.toString(result));

        /*
        1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */

//        System.out.println("--------------------------------------------------");
//

//        String names[] = {"Hulya Keles", "Burak Zeybek", "Aysegul Zeybek", "Melis Keles", "Nuri Karayigit", "Asiye Baki", "Ali Sabanci", "Tugba Baki", "Fehim Skrebo", "Chris Vasquez"};
//        String names2 = "";
//
//        for (int i = 0; i < names.length; i++) {
//
//            for (int i1 = names[i].length() -1; i1 >= 0; i1--) {
//                names2 += names[i].charAt(i1);
//            }
//
//            System.out.println(names2);
//            names2 = "";
//        }

        /*
        2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

//        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
//        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
//        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
//
//        String item = "", itemList = "";
//        int index = 0;
//        boolean isIpad = false;
//
//        for (int i = 0; i < items.length; i++) {
//            item = items[i];
//            if(item.equalsIgnoreCase("gloves")){
//                index = i;
//            }
//            if(item.equalsIgnoreCase("ipad")){
//                isIpad = true;
//            }
//            itemList += items[i] + " - " + prices[i] + " - #" + itemIDs[i] + "\n";
//        }
//
//        System.out.println("Gloves index: " + index);
//        System.out.println("isIpad: " + isIpad);
//        System.out.println(itemList);

        /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */



        /*

        4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A


8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */


    }
}
