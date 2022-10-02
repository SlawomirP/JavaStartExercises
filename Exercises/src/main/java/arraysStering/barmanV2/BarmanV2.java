package arraysStering.barmanV2;

import java.util.List;

public class BarmanV2 {

    Drink createDrink(List<Ingredient> ingredients){
        System.out.println("Drink contains " + ingredients.size() + " ingredients:");
        return new Drink(ingredients);
    }

    void printDrink(Drink drink){
        drink.printDrinkIngredients();
    }
}
