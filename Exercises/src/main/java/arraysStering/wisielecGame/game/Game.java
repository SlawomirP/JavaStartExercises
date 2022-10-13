package arraysStering.wisielecGame.game;

import arraysStering.wisielecGame.config.Config;
import arraysStering.wisielecGame.logic.GetPassword;
import arraysStering.wisielecGame.logic.LetterChecker;
import arraysStering.wisielecGame.logic.PrintArray;
import arraysStering.wisielecGame.logic.RandomNumber;
import arraysStering.wisielecGame.logic.ReturnArray;
import arraysStering.wisielecGame.messages.Messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

    private final GetPassword word = new GetPassword();
    private final RandomNumber random = new RandomNumber();
    private final PrintArray printArray = new PrintArray();
    private final ReturnArray returnArray = new ReturnArray();
    private final Scanner scanner = new Scanner(System.in);
    private final LetterChecker letterChecker = new LetterChecker();
    int attempts = 0;

    public void start() {

        System.out.println("poczatek liczba prob: " + attempts);
        String password = word.getPassword(random.randomNumber());
        System.out.println("haslo -> " + password);

        List<String> splitPassword = new ArrayList<>(Arrays.asList(password.split("")));
        List<String> hidePassword = returnArray.createStarsArray(splitPassword.size());

        System.out.println(Messages.GUESS_PASSWORD);
        printArray.printArray(hidePassword);

        while (attempts < Config.MISTAKES_LIMIT) {
            System.out.println(Messages.WRITE_LETTER);

                if (!letterChecker.checkTheLetter(scanner.next(), splitPassword, hidePassword)) {
                attempts++;
                }

                if(splitPassword.equals(hidePassword)){
                    System.out.println(Messages.YOU_GUESS);
                    printArray.printArray(hidePassword);
                    break;
                }

            System.out.println(Messages.GUESS_PASSWORD);
            printArray.printArray(hidePassword);
            System.out.println("liczba prob po zgadywaniu: " + attempts);


        }
    }
}
