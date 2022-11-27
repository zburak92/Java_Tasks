package day23_ArrayList;

import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {

// Task 1: Average Number of numbers in ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum / (double)numbers.size();
        System.out.println(average);

        //Task 2: return the first unique element from arraylist

        numbers.clear();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++) {
            int frequency = 0;
            int num = numbers.get(i);

            for (int j = 0; j < numbers.size(); j++){
                if(num == numbers.get(j)){
                    frequency ++;
                }
            }
            if(frequency == 1) {
                System.out.println(num);
                break;
            }

        }


    }
}
