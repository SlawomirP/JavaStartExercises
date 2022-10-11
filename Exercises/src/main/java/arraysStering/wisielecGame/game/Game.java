package arraysStering.wisielecGame.game;

import arraysStering.wisielecGame.logic.GetPassword;
import arraysStering.wisielecGame.logic.PrintStars;
import arraysStering.wisielecGame.logic.RandomNumber;
import arraysStering.wisielecGame.messages.Messages;

public class Game {

    private final GetPassword word = new GetPassword();
    private final RandomNumber random = new RandomNumber();

    private final PrintStars printStars = new PrintStars();

    private int mistakesNumber = 0;

    public void start(){
        String password = word.getPassword(random.randomNumber());

        System.out.println(password);

        System.out.println(Messages.GUESS_PASSWORD);

        printStars.printStars(password.length());




    }
}
