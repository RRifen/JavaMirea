package lab02.Task6;

import java.lang.Math;

public class Circle {
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    private Point center;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void changeCenter(Point center) {
        this.center = center;
    }

    public void changeRadius(double radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * radius * radius;
    }

    public double length() {
        return 2 * Math.PI * radius;
    }

    public int compareTo(Circle cmp) {
        return Double.compare(this.getRadius(), cmp.getRadius());
    }

}
