package oop;

public class Main {
    public static void main(String[] args) {

        Cabrio cabrioCar = new Cabrio("Z3", "BMW");

        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
        cabrioCar.openRoof();
        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
        cabrioCar.drivingTime();
        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
        cabrioCar.closeRoof();
        cabrioCar.stopDriving();
        cabrioCar.closeRoof();
        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
    }
}
