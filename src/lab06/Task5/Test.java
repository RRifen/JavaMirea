package lab06.Task5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите координаты центра окружности: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print("Введите скорость по x и скорость по y: ");
        double speedX = in.nextDouble();
        double speedY = in.nextDouble();
        MovablePoint a = new MovablePoint(x, y, speedX, speedY);

        System.out.println("Введите длину радиуса: ");

        double radius = in.nextDouble();
        MovableCircle circle1 = new MovableCircle(a, radius);

        System.out.println("Длина окружности " + circle1.length());
        System.out.println("Площадь " + circle1.square());

        System.out.println("Введите координаты центра второй окружности: ");
        x = in.nextDouble();
        y = in.nextDouble();
        System.out.print("Введите скорость по x и скорость по y: ");
        speedX = in.nextDouble();
        speedY = in.nextDouble();
        a = new MovablePoint(x, y, speedX, speedY);

        System.out.println("Введите длину радиуса второй окружности: ");
        radius = in.nextDouble();
        MovableCircle circle2 = new MovableCircle(a, radius);

        System.out.println("Результат сравнения первой окружности со второй: " + circle1.compareTo(circle2));
        circle1.moveUp();
        System.out.println("Передвигаем первую окружность вверх: " + circle1);
        circle2.moveLeft();
        System.out.println("Передвигаем вторую окружность влево: " + circle2);
    }
}
