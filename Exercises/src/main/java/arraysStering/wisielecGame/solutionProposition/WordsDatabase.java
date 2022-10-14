package arraysStering.wisielecGame.solutionProposition;

import java.util.Random;

public class WordsDatabase {
    private Random random = new Random();

    private final String[] words = {
            "kot w butach",
            "czekolada",
            "java",
            "alicja w krainie czarów"
    };

    public String getRandomWord() {
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
