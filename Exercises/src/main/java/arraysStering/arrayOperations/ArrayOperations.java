package arraysStering.arrayOperations;

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

        System.out.println(sumInArray(tab2));
        printArray(returnArrayWithHigherSum(tab1,tab2));

    }

    public static int[][] returnArrayWithHigherSum(int [][] first, int[][] second){
        if (sumInArray(first) > sumInArray(second)){
            return first;
        } else {
            return second;
        }
    }

    public static int sumInArray(int [][]array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void printArray(int [][]array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
