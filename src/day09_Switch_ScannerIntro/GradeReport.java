package day09_Switch_ScannerIntro;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your score");

        int score = scan.nextInt();
        scan.close();

        String grade;

        if(score <= 100 && score >= 90){
            grade = "A";
        }else if(score <= 89 && score >= 80){
            grade = "B";
        }else if(score <= 79 && score >= 70){
            grade = "C";
        }else if(score <= 69 && score >= 60){
            grade = "D";
        } else if (score <= 59 && score >= 0) {
            grade = "F";
        }else{
            grade = "Invalid Score";
        }

        System.out.println(grade);

        /*
        3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
         */
    }
}
