package day22_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(2,14);

        System.out.println(list);

        int num = list.get(1);

        System.out.println(num);

        System.out.println("--------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firststudent = studentsList.get(1);

        System.out.println(firststudent);

        String lastStudent = studentsList.get(studentsList.size() - 1);

        System.out.println(lastStudent);

    }
}
