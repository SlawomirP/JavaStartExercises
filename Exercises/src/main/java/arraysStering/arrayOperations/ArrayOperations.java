package arraysStering.arrayOperations;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {

        int [][] tab1 = new int[2][3];
        tab1[0][0] = 1;
        tab1[0][1] = 2;
        tab1[0][2] = 3;
        tab1[1][0] = 1;
        tab1[1][1] = 1;
        tab1[1][2] = 1;

        int [][] tab2 = new int[2][3];
        tab2[0][0] = 1;
        tab2[0][1] = 2;
        tab2[0][2] = 2;
        tab2[1][0] = 1;
        tab2[1][1] = 1;
        tab2[1][2] = 1;

        String[] tab4 = {"Tom", "Berry", "Edd"};
        String[] tab3  = {"Tom", "Berry", "Edd", "Fiona"};

        System.out.println(sumInArray(tab2));
        printArray(returnArrayWithHigherSum(tab1,tab2));
        printArray(returnArrayWithHigherNumberOfLetters(tab3, tab4));

    }

    public static int[][] returnArrayWithHigherSum(int [][] first, int[][] second){
        if (sumInArray(first) > sumInArray(second)){
            return first;
        } else {
            return second;
        }
    }

    public static  String[] returnArrayWithHigherNumberOfLetters( String[] array1, String[] array2){
        if (returnSumOfLetterInArray(array1) > returnSumOfLetterInArray(array2)){
            return array1;
        } else {
            return array2;
        }
    }

    private static int sumInArray(int [][]array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static int returnSumOfLetterInArray(String[] array){
        int sumOfLetters = 0;
        for (String s : array) {
            sumOfLetters += s.length();
        }
        return sumOfLetters;
    }

    public static void printArray(int [][]array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printArray(String[] array){
        for(String record: array){
            System.out.println(record);
        }
    }
}
