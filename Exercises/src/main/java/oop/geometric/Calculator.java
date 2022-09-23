package oop.geometric;

public class Calculator {

    public static double rectangleArea(Rectangle rectangle) {
        return stretch(rectangle.getPoint1(), rectangle.getPoint2()) *
                stretch(rectangle.getPoint2(), rectangle.getPoint3());
    }

    public static boolean isInOrOnCirculumference(Point point, Circle circle) {
        if (stretch(point, circle.getCircleCenter()) < circle.getR()) {
            System.out.println("Point is in the middle of circle");
            return true;
        } else if (stretch(point, circle.getCircleCenter()) == circle.getR()) {
            System.out.println("Point is on the circle circulumference");
            return true;
        } else {
            System.out.println("Point is outside the circle");
            return false;
        }
    }

    private static double stretch(Point a, Point b) {
        double underSqrt = Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2);
        return Math.sqrt(absoluteValue(underSqrt));
    }

    private static double absoluteValue(Double value) {
        if (value < 0) {
            return value * (-1);
        }
        return value;
    }
}
