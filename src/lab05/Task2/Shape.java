package lab05.Task2;

import java.awt.*;

public abstract class Shape {
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

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    private Color colour;

}
