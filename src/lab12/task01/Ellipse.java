package lab12.task01;

import java.awt.*;
import java.awt.Shape;

public class Ellipse extends lab12.task01.Shape {
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
