package oop.bar;

public class Drink {

    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    public Drink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public Ingredient getIngredient1() {
        return ingredient1;
    }

    public Ingredient getIngredient2() {
        return ingredient2;
    }

    public Ingredient getIngredient3() {
        return ingredient3;
    }
}
