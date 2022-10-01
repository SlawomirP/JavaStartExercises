package arraysStering.barmanV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink {

    List<Ingredient> ingredients = new ArrayList<>();

    public Drink(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    void addIngredient (Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    int getNumberOfIngredients(){
        return ingredients.size();
    }

    void printDrinkIngredients(){
        for (Ingredient ingredient: ingredients
             ) {
            System.out.println(ingredient);

        }
    }
}
