package lab06.Task5;

public class MovablePoint implements Movable{
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

    private final double speedX;
    private final double speedY;
    public MovablePoint(double x, double y, double speedX, double speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public String toString() {
        return "{x=" + x + "; " +
                "y=" + y + "}";
    }

    @Override
    public void moveUp() {
        y += speedY;
    }

    @Override
    public void moveDown() {
        y -= speedY;
    }

    @Override
    public void moveLeft() {
        x -= speedX;
    }

    @Override
    public void moveRight() {
        x += speedX;
    }
}
