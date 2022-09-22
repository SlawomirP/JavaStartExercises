package oop.car;

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

    public void openRoof(){
        if(isMoving){
            System.out.println("You con't open the roof when car is moving.");
        } else {
            System.out.println("Roof is opening");
            isRoofOpen = true;
        }

    }
    public void closeRoof(){
        if(isMoving){
            System.out.println("You con't close the roof when car is moving.");
        } else {
            System.out.println("Roof is closing");
            isRoofOpen = true;
        }
    }

    public void drivingTime(){
        System.out.println("Car is moving");
        this.isMoving = true;
    }

    public void stopDriving(){
        System.out.println("Car has stopped");
        this.isMoving = false;
    }

    public boolean isRoofOpen(){
        return this.isRoofOpen;
    }

    public boolean isMoving() {
        return isMoving;
    }
}
