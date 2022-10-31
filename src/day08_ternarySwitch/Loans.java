package day08_ternarySwitch;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        int salary,
                creditScore;

        String loanResult;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Salary: ");
        salary = scan.nextInt();

        System.out.println("Enter credit score: ");
        creditScore = scan.nextInt();

        loanResult = (salary >= 60000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied";

        System.out.println(loanResult);

        /*
        2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
         */

    }
}
