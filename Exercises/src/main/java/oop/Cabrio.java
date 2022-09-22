package oop;

public class Cabrio {

    private String name;
    private String brand;
    private boolean isMoving;
    private boolean isRoofOpen;

    public Cabrio(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.isMoving = false;
        this.isRoofOpen = false;
    }

    void openRoof(){
        if(isMoving){
            System.out.println("You con't open the roof when car is moving.");
        } else {
            System.out.println("Roof is opening");
            isRoofOpen = true;
        }

    }
    void closeRoof(){
        if(isMoving){
            System.out.println("You con't close the roof when car is moving.");
        } else {
            System.out.println("Roof is closing");
            isRoofOpen = true;
        }
    }

    void drivingTime(){
        System.out.println("Car is moving");
        this.isMoving = true;
    }

    void stopDriving(){
        System.out.println("Car has stopped");
        this.isMoving = false;
    }

    boolean isRoofOpen(){
        return this.isRoofOpen;
    }

    public boolean isMoving() {
        return isMoving;
    }
}
