package arraysStering.fizzBuzz;

import java.util.List;

public class FizzBuzzStream {

    public static void fizzBuzzStream (List<Integer> list){
        list.stream()
                .forEach(value -> {
                    if (value % 3 == 0 && value % 5 == 0) {
                        System.out.println("FizzBuzz --> " + value);
                    } else if (value % 5 == 0) {
                        System.out.println("Buzz --> " + value);
                    } else if (value % 3 == 0) {
                        System.out.println("Fizz --> " + value);
                    }
                });
    }
}
