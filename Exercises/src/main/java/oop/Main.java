package oop;

import oop.bar.Barman;
import oop.bar.Drink;
import oop.car.Cabrio;
import oop.geometric.Calculator;
import oop.geometric.Circle;
import oop.geometric.Point;
import oop.geometric.Rectangle;
import oop.paymentCalculator.Emplyee;
import oop.paymentCalculator.PaymentCalculator;

public class Main {
    public static void main(String[] args) {

//        Cabrio cabrioCar = new Cabrio("Z3", "BMW");
//
//        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
//        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
//        cabrioCar.openRoof();
//        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
//        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
//        cabrioCar.drivingTime();
//        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
//        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());
//        cabrioCar.closeRoof();
//        cabrioCar.stopDriving();
//        cabrioCar.closeRoof();
//        System.out.println("Is car moving ? => " + cabrioCar.isMoving());
//        System.out.println("Is roof open ? => " + cabrioCar.isRoofOpen());

//        Barman tom = new Barman();
//        Drink drink1 = tom.createDrink("Pinealple juice", 100, "Malibu liqueur", 50, "Coconut milk", 100);
//        tom.printDrink(drink1);

//        Emplyee slaw = new Emplyee("Slaw", "Rich",  3000);
//
//        System.out.println(PaymentCalculator.nettoYearPayment(slaw));
//        System.out.println(PaymentCalculator.bruttoYearPayment(slaw));

        Point rectangle1 = new Point(-1,2);
        Point rectangle2 = new Point(1,2);
        Point rectangle3 = new Point(1,-1);
        Point rectangle4 = new Point(-1,-1);

        Point centerCircle = new Point(0,0);
        int circleRadius = 5;

        Point testPointIn = new Point(0,4);
        Point testPointOn = new Point(0,5);
        Point testPointOut = new Point(0,6);



        Rectangle rectangle = new Rectangle(rectangle1, rectangle2, rectangle3, rectangle4);
        Circle circle = new Circle(centerCircle,circleRadius);

        System.out.println("Rectangle area is: " + Calculator.rectangleArea(rectangle));
        System.out.println("Is point " + testPointOut + " in cirlce or on circle circulumference? ");
        Calculator.isInOrOnCirculumference(testPointOut,circle);
    }
}
