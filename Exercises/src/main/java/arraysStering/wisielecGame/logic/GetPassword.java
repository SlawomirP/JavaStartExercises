package arraysStering.wisielecGame.logic;

import arraysStering.wisielecGame.data.Data;

public class GetPassword {

    public String getPassword(int number) {
        return Data.PASSWORDS.get(number);
    }
}
