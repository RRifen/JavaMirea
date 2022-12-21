package lab12.task01;

import java.awt.*;
import java.awt.Shape;

public class Rectangle extends lab12.task01.Shape {
    public double getXx() {
        return xx;
    }

    private final double xx;

    public double getYy() {
        return yy;
    }

    private final double yy;

    public Rectangle(double x, double y, double xx, double yy, Color colour) {
        setX(x);
        setY(y);
        setColour(colour);
        this.xx = xx;
        this.yy = yy;
    }

}
