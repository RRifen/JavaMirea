package lab05.Task2;

import java.awt.*;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Ellipse extends lab05.Task2.Shape {
    public double getWidth() {
        return width;
    }

    private final double width;

    public double getHeight() {
        return height;
    }

    private final double height;
    public Ellipse(double x, double y, double width, double height, Color color) {
        setX((double)x);
        setY(y);
        setColour(color);
        this.width = width;
        this.height = height;
    }



}
