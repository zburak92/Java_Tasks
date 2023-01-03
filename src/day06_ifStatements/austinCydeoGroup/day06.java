package day06_ifStatements.austinCydeoGroup;

public class day06 {
    public static void main(String[] args) {


        int a = 10, b = 15, c = 20;

        if(a < b && a > c || a > b && a < c){
            System.out.println(a + " is the median number");
        }else if(b < a && b > c || b > a && b < c){
            System.out.println(b + " is the median number");
        }else{
            System.out.println(c + "is the median number");
        }

        /*
        1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number
        */
        System.out.println("----------------------------------");

        String numberWord;
        int number = 1;

        if(number == 1){
            numberWord = "one";
        }else if(number == 2){
            numberWord = "two";
        }else if(number == 3){
            numberWord = "three";
        }else{
            numberWord = "nine";
        }
        System.out.println(numberWord);

        numberWord = (number ==1)? "one" : "two";
        System.out.println("numberWord = " + numberWord);

        /*
        2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

        Note: Do not use more than one print statement

        */

        System.out.println("-----------------------");

        double n1 = 10, n2 = 20;
        char operator = '+';

        if(operator == '+'){
            n1 += n2;
        }else if(operator == '-'){
            n1 -= n2;
        }else if(operator == '*'){
            n1 *= n2;
        }else if(operator == '/'){
            n1 /= n2;
        }else if(operator == '%'){
            n1 %= n2;
        }else{
            System.out.println("invalid operator");
        }
        System.out.println(n1);


        /*
        3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

        char operator -> -, +, *, /

        when operator is + : add num1, num2
        when operator: - : minus num1, num2
        when operator: * : multiply num1, num2
        when operator: / : divide num1, num2
        for any other operators: print "invalid operator"

        Ex:
        n1 = 10, n2= 20, mathOperator = '+'

        output:
        30

        */
        System.out.println("----------------------------------------");

        String language;
        int langNum = 2;

        if(langNum == 1)
            language = "Hello, thank you for your call";
        else if(langNum == 2)
            language = "Hola, gracias para llamar";
        else if(langNum == 3)
            language = "Merhaba, aradiginiz icin tesekkurler";
        else
            language = "Merci, pour votre appel";

        System.out.println(language);



        /*
        4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

        for 1: Hello, thank for your call
        for 2: Hola, gracias para llamar
        for 3: Merhaba, aradiginiz icin tesekkurler
        for 4: Privet, spasibo za vash zvonok
        for 5: Merci ,pour votre appel

        Note: Do not use more than one print statement

        */
        System.out.println("------------------------------");

        char ch = '1';

        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("Alphabetic character");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }else{
            System.out.println("Special character");
        }

        /*

        5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

        Ex:
        ch = '@'

        output:
        Special Character


        ch = '1'

        output:
        digit

        HINT: You may wanna check out the numbers of the chracters on ASCII table




        6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

        age groups are:
        infant (1 - 2)
        Toddler (3 - 5),
                Kid (6 - 9),
                Pre-Teen (10 - 12),
                Teenager (13 - 17),
                Young Adult (18 - 20),
                Adult (21 - 39),
                Young Middle-Aged Adult (40 - 49),
                Middle-Aged Adult (50 - 54),
                Very Young Senior Citizen (55 - 64),
                Young Senior Citizen (65 - 74),
                Senior Citizen (75 - 84),
                Old Senior Citizen (85+)

        Note: Do not use more than one print statement
        */
        System.out.println("------------------------------------");

        int num1 = 10, num2 = 30, num3 = 20;
        if(num1 == num2 && num2 == num3){
            System.out.println("all equal");
        }else if(num1 == num2){
            System.out.println("n1 & n2 are equal");
        }else if(num2 == num3){
            System.out.println("num2 and num3 are equal");
        }else if(num1 == num3){
            System.out.println("num1 and num3 are equal");
        }else{
            System.out.println("none are equal");
        }

        /*

        7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
                declare 3 numbers n1, n2, n3
        if all are equal ==> print "all equal"
        if only n1 and n2 are equal  =>print  "n1&n2 are equal"
        if only n2 and n3 are equal ==>print "n2&n3 are equal"
        if only n3 and n1 are qual ==>print "n3&n1 are equal"
        if none of them are euqal ==> none of them are equal



        8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
        */
        System.out.println("------------------------------------");


        double salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0;

        if (salary >= 130000) { //false: salary < 130000;
            taxRate = 0.35; //35%
        }

        if (salary < 130000 && salary >= 100000) { //false: salary < 100000;
            taxRate = 0.30; //30%
        }

        if (salary < 100000 && salary >= 80000) { //false: salary < 80000
            taxRate = 0.25; //25%
        }

        if (salary < 80000) {
            taxRate = 0.20; //20%
        }


        if (isMarried) { // if the person is married
            taxRate -= 0.05; // subtracting 5% from the original tax rate
        }

        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);



        /*

        9. Create a class named NetIncomeCalc, Write a program that can calculate the salary
        after tax based on the following requirements the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 129k
        25% for salary of 80K to 99K
        20% for salary of 79K or less

        in addition, if the person is married, he/she will pay 5% less tax
            */

    }
}
