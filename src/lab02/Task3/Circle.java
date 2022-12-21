package lab02.Task3;

public class Circle {
    Point center;
    int radius;

    Circle(double x, double y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    Circle(Point center, int radius) {
        this.center = center;
    }

    public String toString() {
        return "Circle: {center: " + this.center + " radius: " + this.radius + "}";
    }
}
