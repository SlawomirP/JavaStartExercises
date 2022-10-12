package arraysStering.wisielecGame.logic;

import java.lang.reflect.Array;

public class ReturnArray {

    public String[] createStarsArray(int size){
        String[] starsArray = new String[size];
        for (int i = 0; i < size; i++) {
            starsArray[i] = "*";
        }
        return starsArray;
    }
}
