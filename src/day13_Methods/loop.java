package day13_Methods;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userNameInTheSystem = "Cydeo";
        String passwordInTheSystem = "Cydeo123";


        for (int i = 0; i <= 3; i++) {
            System.out.println("Enter your username");
            String userName = scan.next();

            System.out.println("Enter your password");
            String password = scan.next();


            if (i != 3 && (!(userName.equals(userNameInTheSystem)) || !(password.equals(passwordInTheSystem)))) {
                System.err.println("Invalid username or password! Please re-enter your information. ");
            }

            if (userName.equals(userNameInTheSystem) && password.equals(passwordInTheSystem)) {
                System.out.println("Logged-in");
                break;
            }

            if (i == 3) {
                System.err.println("Your account is locked");
                break;
            }
        }
    }
}
