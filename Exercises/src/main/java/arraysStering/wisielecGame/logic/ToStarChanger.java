package arraysStering.wisielecGame.logic;

import java.util.ArrayList;
import java.util.List;

public class ToStarChanger {

    public List<String> changeToStar(List<String> base){
        List<String> returnedList = new ArrayList<>(base.size());
        for(int i = 0; i < base.size(); i++){
            if(!base.get(i).equals(" ")){
                returnedList.add(i, "*");
            }
            if (base.get(i).equals(" ")){
                returnedList.add(i, " ");
            }
        }
        return returnedList;
    }
}
