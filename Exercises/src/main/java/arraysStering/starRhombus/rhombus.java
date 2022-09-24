package arraysStering.starRhombus;

public class rhombus {
    public static void main(String[] args) {
        
        int number = 10;
        char symbol = '*';
        char emptyPlace = ' ';

        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++){
                System.out.print(emptyPlace);
            }
            for (int j = 0; j < number; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            
        }
    }
}
