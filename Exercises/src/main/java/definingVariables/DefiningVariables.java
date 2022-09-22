package definingVariables;

public class DefiningVariables {
    public static void main(String[] args) {

        System.out.printf("%.2f", 1.23456789);
        System.out.println();
        System.out.printf("%.3f", 1.23456789);
        System.out.println();
        System.out.printf("%.4f", 1.23456789);
        System.out.println();
        System.out.printf("%.2f + %.2f + %.2f = %.2f", 1.111, 2.222, 3.333, (1.111 + 2.222 + 3.333));
        System.out.println();
        double a = 1.111;
        double b = 2.222;
        double c = 3.333;
        double sum = a+b+c;
        System.out.printf("%.2f + %.2f + %.2f = %.2f", a, b, c, sum);
    }

}
