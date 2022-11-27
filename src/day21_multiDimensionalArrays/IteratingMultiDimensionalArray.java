package day21_multiDimensionalArrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int arr1[] = {10,20,30};
        int arr2[] = {40, 50, 60, 70, 80};
        int arr3[] = {90, 100};

        int arr2D[][] = {arr1, arr2, arr3};


        for(int eachArr[] : arr2D){
            for (int each : eachArr){
                System.out.print(each + " ");
            }
            System.out.println();
        }


    }
}
