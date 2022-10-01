package arraysStering.barmanV2;

public class Ingredient {

    private String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return "- " + this.name + " (" + this.quantity + ")";
    }
}
