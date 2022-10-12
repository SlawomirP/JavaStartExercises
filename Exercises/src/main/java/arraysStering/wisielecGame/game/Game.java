package arraysStering.wisielecGame.game;

import arraysStering.wisielecGame.logic.GetPassword;
import arraysStering.wisielecGame.logic.PrintArray;
import arraysStering.wisielecGame.logic.RandomNumber;
import arraysStering.wisielecGame.logic.ReturnArray;
import arraysStering.wisielecGame.messages.Messages;

public class Game {

    private final GetPassword word = new GetPassword();
    private final RandomNumber random = new RandomNumber();

    private final PrintArray printArray = new PrintArray();

    private final ReturnArray returnArray = new ReturnArray();

    private int mistakesNumber = 0;

    public void start(){

        String password = word.getPassword(random.randomNumber());
        String[] splitPassword = password.split("");
        String[] hidePassword = returnArray.createStarsArray(splitPassword.length);


        System.out.println(Messages.GUESS_PASSWORD);
        printArray.printArray(hidePassword);



        System.out.println(Messages.WRITE_LETTER);




    }
}
