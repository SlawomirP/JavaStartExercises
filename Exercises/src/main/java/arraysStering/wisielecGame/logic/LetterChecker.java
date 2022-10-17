package arraysStering.wisielecGame.logic;

import java.util.List;

public class LetterChecker {

    public boolean checkTheLetter(String letter, List<String> searchedArray, List<String> overwriteArray) {
        if (searchedArray.contains(letter)) {
            for (int i = 0; i < searchedArray.size(); i++) {
                if (searchedArray.get(i).equals(letter)) {
                    overwriteArray.set(i, letter);
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
