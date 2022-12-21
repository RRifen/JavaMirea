package lab06.Task5;

public class MovableCircle implements Movable {
    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    private MovablePoint center;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    MovableCircle(MovablePoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void changeCenter(MovablePoint center) {
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

    public int compareTo(MovableCircle cmp) {
        return Double.compare(this.getRadius(), cmp.getRadius());
    }

    @Override
    public String toString() {
        return "{radius=" + radius + "; " +
                "center=" + center + "}";
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
