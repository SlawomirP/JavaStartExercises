package dataFromUser;

import java.util.ArrayList;
import java.util.Scanner;

public class DataFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        while (true) {
            System.out.println("Write your number ... - 0 -> end");
            int number = scanner.nextInt();
            if(number == 0){
                break;
            }
            numbers.add(number);
        }
        System.out.println("Amount of numbers: " + numbers.size());
        System.out.println("Yours numbers:");
        for(Integer number: numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Yours squared numbers:");
        for(Integer number: numbers){
            System.out.print(Math.pow(number,2) + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}
