package oop.geometric;

public class Circle {

    private Point circleCenter;
    private int r;

    public Circle(Point circleCenter, int r) {
        this.circleCenter = circleCenter;
        this.r = r;
    }

    public Point getCircleCenter() {
        return circleCenter;
    }

    public int getR() {
        return r;
    }
}
