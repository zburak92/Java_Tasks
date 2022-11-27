package day21_multiDimensionalArrays;

public class Task1_RemoveExtraSpaces {

    public static void main(String[] args) {
        String str = "    Hello world       I      love     Java";

        String words[] = str.split(" ");

        str = "";

        for(String arrayWord : words){
            if(!arrayWord.isEmpty())
                str += arrayWord + " ";

        }

        str = str.trim();

        System.out.println(str);



        //Task 2



    }

}
