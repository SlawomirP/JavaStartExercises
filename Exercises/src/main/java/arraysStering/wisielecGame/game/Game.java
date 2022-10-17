package arraysStering.wisielecGame.game;

import arraysStering.wisielecGame.config.Config;
import arraysStering.wisielecGame.logic.GetPassword;
import arraysStering.wisielecGame.logic.LetterChecker;
import arraysStering.wisielecGame.logic.PrintArray;
import arraysStering.wisielecGame.logic.RandomNumber;
import arraysStering.wisielecGame.logic.ReturnArray;
import arraysStering.wisielecGame.logic.ToStarChanger;
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
    private final ToStarChanger toStarChanger = new ToStarChanger();
    int attempts = 0;

    public void start() {

        String password = word.getPassword(random.randomNumber());


        List<String> splitPassword = new ArrayList<>(Arrays.asList(password.split("")));
        printArray.printArray(splitPassword);
        List<String> hidPassword = toStarChanger.changeToStar(splitPassword);




        System.out.println(Messages.GUESS_PASSWORD);
        printArray.printArray(hidPassword);

        while (attempts < Config.MISTAKES_LIMIT) {
            System.out.println(Messages.WRITE_LETTER);

                if (!letterChecker.checkTheLetter(scanner.next(), splitPassword, hidPassword)) {
                attempts++;
                }

                if(splitPassword.equals(hidPassword)){
                    System.out.println(Messages.YOU_GUESS);
                    printArray.printArray(hidPassword);
                    break;
                }

            System.out.println(Messages.GUESS_PASSWORD);
            printArray.printArray(hidPassword);



        }
    }
}
