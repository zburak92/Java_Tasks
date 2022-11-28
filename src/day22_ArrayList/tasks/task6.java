package day22_ArrayList.tasks;

public class task6 {
    public static void main(String[] args) {
        String str = "JAVA java";

        int i = 0, j = 0;
        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                i++;
            }else if(Character.isLowerCase(each)){
                j++;
            }

        }

        System.out.println(i == j);


    }

}
/*
6. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods

 */
