package arraysStering.wisielecGame.solutionProposition;


public class Hangman {

    private static final int MAX_MISTAKES = 8;

    private String guessWord;
    private String guessWordDisplay;
    private char[] userGuesses;
    private int guesses;
    private int mistakes;

    public Hangman(String guessWord) {
        this.guessWord = guessWord;
        userGuesses = new char[32];
        generateDisplay();
    }

    public String getGuessWord() {
        return guessWord;
    }

    public String getGuessWordDisplay() {
        return guessWordDisplay;
    }

    public boolean userLost() {
        return mistakes >= MAX_MISTAKES;
    }

    public boolean userWon() {
        return !guessWordDisplay.contains("*");
    }

    public void checkLetter(char letter) {
        if (!arrayContains(userGuesses, letter)) {
            checkMistake(letter);
            rememberGuess(letter);
            generateDisplay();
        }
    }

    private void checkMistake(char letter) {
        if (guessWord.indexOf(letter) == -1) {
            mistakes++;
        }
    }

    private void rememberGuess(char letter) {
        userGuesses[guesses] = letter;
        guesses++;
    }

    private void generateDisplay() {
        String display = "";
        for (int i = 0; i < guessWord.length(); i++) {
            char nextChar = guessWord.charAt(i);
            if (arrayContains(userGuesses, nextChar))
                display += nextChar;
            else if (nextChar == ' ')
                display += ' ';
            else
                display += "*";
        }
        this.guessWordDisplay = display;
    }

    private boolean arrayContains(char[] array, char letter) {
        for (char element : array) {
            if (element == letter)
                return true;
        }
        return false;
    }

}

