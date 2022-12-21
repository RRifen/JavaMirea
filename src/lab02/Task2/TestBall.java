package lab02.Task2;

import java.util.Scanner;

public class TestBall {
    public TestBall() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println(ball);
        System.out.print("Введите перемещение по x: ");
        double xDisp = in.nextDouble();
        System.out.print("Введите перемещение по y: ");
        double yDisp = in.nextDouble();
        ball.move(xDisp, yDisp);
        System.out.println("x = " + ball.getX());
        System.out.println("y = " + ball.getY());
    }
}