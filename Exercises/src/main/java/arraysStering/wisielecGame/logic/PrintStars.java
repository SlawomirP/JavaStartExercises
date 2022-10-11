package arraysStering.wisielecGame.logic;

import arraysStering.wisielecGame.messages.Messages;

public class PrintStars {

    public void printStars(int numbersOfStars){
        for (int i = 0; i < numbersOfStars ; i++) {
            System.out.println(Messages.STAR);
        }
    }
}
