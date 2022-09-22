package oop.bar;

public class Barman {

    public Drink createDrink(String name1, int quantity1,String name2, int quantity2,String name3, int quantity3){
    Drink drink = new Drink(new Ingredient(name1, quantity1), new Ingredient(name2,quantity2), new Ingredient(name3,quantity3));
        return drink;
    }

   public void printDrink(Drink drink){
        System.out.println("Ingredients of the drink: " + drink.getIngredient1().getName() + ", " + drink.getIngredient2().getName() + ", " +
                drink.getIngredient3().getName() + " in portion 0.40, 0.40, 0.40. Drink capacity is: " + (drink.getIngredient1().getQuantity()
        + drink.getIngredient2().getQuantity() + drink.getIngredient3().getQuantity()));
    }
}
