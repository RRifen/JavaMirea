package lab02.Task3;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + this.x + " y=" + this.y;
    }
}