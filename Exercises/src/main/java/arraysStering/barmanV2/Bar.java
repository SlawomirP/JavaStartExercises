package arraysStering.barmanV2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bar {
private final static Scanner SCANNER = new Scanner(System.in);
private BarmanV2 barman = new BarmanV2();
private List<Ingredient> ingredientList = new ArrayList<>();

    public Bar() {
    }

    public void start(){
        System.out.println("Write number of ingredients");
        int numberOfIngredients = SCANNER.nextInt();

        while(ingredientList.size() != numberOfIngredients){
            System.out.println("Write name of the ingredient");
            String name = SCANNER.next();
            System.out.println("Write quantity of the ingredient");
            int quantity = SCANNER.nextInt();
            ingredientList.add(new Ingredient(name, quantity));
        }
        Drink drink = barman.createDrink(ingredientList);
        barman.printDrink(drink);
    }
}
