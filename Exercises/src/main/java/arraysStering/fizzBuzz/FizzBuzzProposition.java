package arraysStering.fizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzzProposition {
    public static void main(String[] args) {

        // utworzenie strimu od 1 do nieskonczonosci
        IntStream.iterate(1, i -> i+1)
                .limit(100) // ograniczenie strimu do 100 - wlacznie
                .forEach(FizzBuzzProposition::fizzBuzz); //wywolanie na kazdym
        //elemencie metody statycznej z klasy - referencja do metody


        //wygenerowanie strumienia domknietego 1 - 100
        IntStream.rangeClosed(1, 101)
                .forEach(number -> {
                    if(number%15 == 0)
                        System.out.println(number + " FizzBuzz");
                    else if(number%3 == 0)
                        System.out.println(number + " Fizz");
                    else if(number%5 == 0)
                        System.out.println(number + " Buzz");
                });
    }
    private static void fizzBuzz(int number) {
        if(number%15 == 0)
            System.out.println(number + " FizzBuzz");
        else if(number%3 == 0)
            System.out.println(number + " Fizz");
        else if(number%5 == 0)
            System.out.println(number + " Buzz");
    }
}
