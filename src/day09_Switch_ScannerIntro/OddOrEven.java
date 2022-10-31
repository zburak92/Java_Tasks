package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = scan.nextInt();
        String month = "";

        switch (num){
            case 1:
                month = "January";
                break;
            case 2:
                month = "Feb";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "Sept";
                break;
            case 10:
                month = "Oct";
                break;
            case 11:
                month = "Nov";
                break;
            case 12:
                month = "Dec";
                break;
            default:
                month = "Invalid Month";
                break;
        }

        System.out.println(month);



    }
}
