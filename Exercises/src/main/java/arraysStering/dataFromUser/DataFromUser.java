package arraysStering.dataFromUser;

public class DataFromUser {
    public static void main(String[] args) {

        int userNumber = -2;
        double start = 0.0;

        if (userNumber < 0){
            for (int i = 0; i <= userNumber*(-10); i++) {
                System.out.printf("%.1f",start);
                System.out.print("   ");
                start -= 0.1;
            }
        }else{
            for (int i = 0; i <= userNumber*10; i++) {
                System.out.printf("%.1f",start);
                System.out.print("   ");
                start += 0.1;
            }
        }





    }
}
