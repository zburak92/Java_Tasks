package day08_ternarySwitch;

public class ChooseLanguage {
    public static void main(String[] args) {


        int n = 3;
        String lang = "";

        lang = (n == 1) ? "Hello, thank you for your call" : (n == 2) ? "Hola, gracias para llamar" : "Invalid Number";

        System.out.println(lang);

        System.out.println("-----------------------------------");

        switch (n){
            case 1:
                lang = "Hello, thank for your call";
                break;
            case 2:
                lang = "Hola, gracias para llamar";
                break;
            case 3:
                lang = "Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4 :
                lang = "Privet, spasibo za vash zvonok";
                break;
            case 5:
                lang = "Merci ,pour votre appel";
                break;
            default:
                lang = "Invalid Number";
                break;

        }

        System.out.println(lang);


        /*5. Create a class called ChooseLanguage,
                Given an integer variable named selection that has a number between 1~5.
        Write a program that can select the language based on the number that's given in selection and prints the following message:

        for 1: Hello, thank for your call
        for 2: Hola, gracias para llamar
        for 3: Merhaba, aradiginiz icin tesekkurler
        for 4: Privet, spasibo za vash zvonok
        for 5: Merci ,pour votre appel

        for any other numbers print "Invalid Number"

        Solution 1: Must use ternary
        Solution 2:	MUST use switch statement
        */
    }
}
