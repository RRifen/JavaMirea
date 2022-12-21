package lab05.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.util.Random;

public class ShapeFrame extends JFrame {
    public ShapeFrame(){
        setSize(1280,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String a[]){
        new ShapeFrame();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int shapeChoice;
        float red;
        float green;
        float blue;
        int x, y, width, height;
        Color color;
        Ellipse ellipse;
        lab05.Task2.Rectangle rectangle;
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            shapeChoice = random.nextInt(2);
            x = random.nextInt(1280);
            y = random.nextInt(720);
            width = random.nextInt(1280 - x);
            height = random.nextInt(720 - y);
            red   = random.nextFloat();
            green = random.nextFloat();
            blue  = random.nextFloat();
            color = new Color(red, green, blue);
            if (shapeChoice == 1) {
                ellipse = new Ellipse(x, y, width, height, color);
                g.setColor(color);
                g.fillOval((int)ellipse.getX(), (int)ellipse.getY(), (int)ellipse.getWidth(), (int)ellipse.getHeight());
            }
            else {
                rectangle = new lab05.Task2.Rectangle(x, y, width, height, color);
                g.setColor(color);
                g.fillRect((int)rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getXx(), (int)rectangle.getYy());
            }
        }
    }

}
