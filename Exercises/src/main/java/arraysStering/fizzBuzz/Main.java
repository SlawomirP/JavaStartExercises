package arraysStering.fizzBuzz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100 ; i++) {
            list.add( i);
        }

//        FizzBuzzClassic.fizzBuzzClassic(list);
        FizzBuzzStream.fizzBuzzStream(list);





    }
}
