package arraysStering.fizzBuzz;

import java.util.List;

public class FizzBuzzClassic {

    public static void fizzBuzzClassic(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 && list.get(i) % 5 == 0) {
                System.out.println("FizzBuzz --> " + list.get(i));
            } else if (list.get(i) % 5 == 0) {
                System.out.println("Buzz --> " + list.get(i));
            } else if (list.get(i) % 3 == 0) {
                System.out.println("Fizz --> " + list.get(i));
            }
        }
    }
}
