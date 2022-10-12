package arraysStering.wisielecGame.logic;

import java.util.List;

public class PrintArray {

    public void printArray(List<String> password){
        for (int i = 0; i < password.size() ; i++) {
            System.out.print(password.get(i));
        }
        System.out.println();
    }
}
