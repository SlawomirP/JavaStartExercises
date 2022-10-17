package arraysStering.wisielecGame.logic;

import java.util.ArrayList;
import java.util.List;

public class ReturnArray {

    public List<String> createStarsArray(int size) {
        List<String> starsArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            starsArray.add("*");
        }
        return starsArray;
    }
}
