package lab02.Task6;

public class Point {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    private double x;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
