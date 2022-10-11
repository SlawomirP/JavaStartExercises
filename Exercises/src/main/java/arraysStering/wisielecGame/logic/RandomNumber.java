package arraysStering.wisielecGame.logic;

import arraysStering.wisielecGame.config.Config;

import java.util.Random;

public class RandomNumber {

    Random random = new Random();

    public int randomNumber() {
        return random.nextInt(Config.UPPER_BOUND);
    }

}
