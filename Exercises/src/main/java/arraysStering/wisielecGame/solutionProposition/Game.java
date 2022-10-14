package arraysStering.wisielecGame.solutionProposition;

import java.util.Scanner;

public class Game {

    private static final int NEXT_GAME = 1;
    private static final int END_GAME = 2;

    private WordsDatabase db = new WordsDatabase();
    private Scanner input = new Scanner(System.in);

    public void mainLoop() {
        int option = NEXT_GAME;
        while (option != END_GAME) {
            play();
            showOptions();
            option = input.nextInt();
            input.nextLine();
        }
        System.out.println("Bye bye!");
    }

    private void showOptions() {
        System.out.println(NEXT_GAME + " - Graj dalej");
        System.out.println(END_GAME + " - Koniec programu");
    }

    private void play() {
        Hangman hangman = new Hangman(db.getRandomWord());
        do {
            System.out.println("\nHasło do zgadnięcia:");
            String guessWordDisplay = hangman.getGuessWordDisplay();
            System.out.println(guessWordDisplay);
            System.out.println("Podaj literę:");
            String line = input.nextLine();
            char userGuess = line.charAt(0);
            hangman.checkLetter(userGuess);
        } while(!hangman.userLost() && !hangman.userWon());
        System.out.println();
        if(hangman.userLost())
            System.out.println("Przegrałeś!");
        else if(hangman.userWon())
            System.out.println("Wygrałeś!");
        System.out.printf("Hasło: %s\n\n", hangman.getGuessWord());
    }
}