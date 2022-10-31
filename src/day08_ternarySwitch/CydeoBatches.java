package day08_ternarySwitch;

public class CydeoBatches {
    public static void main(String[] args) {


        int score = 0;
        if(score == 0){
            score += 50;
            
        }
        if (score != 0){
            score += 50;
        }
        System.out.println("score = " + score);

        System.out.println("---------------");

        boolean a = true, b = !false;

        if (b) {
            System.out.println("b");
        }else if (a){
            System.out.println("a");
        }else {
            System.out.println("c");
        }

        System.out.println("--------------------");


        /*
        10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch. 

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


         */
    }
}
