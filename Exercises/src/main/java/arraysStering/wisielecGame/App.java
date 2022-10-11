package arraysStering.wisielecGame;

import arraysStering.wisielecGame.game.Game;
import arraysStering.wisielecGame.logic.RandomNumber;

public class App {
    public static void main(String[] args) {

        Game game = new Game();


        for (int i = 0; i < 25; i++) {
            game.start();
        }
    }
}
