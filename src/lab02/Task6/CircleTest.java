package lab02.Task6;
import java.util.*;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите координаты центра окружности: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        Point a = new Point(x, y);

        System.out.println("Введите длину радиуса: ");

        double radius = in.nextDouble();
        Circle circle1 = new Circle(a, radius);

        System.out.println("Длина окружности " + circle1.length());
        System.out.println("Площадь " + circle1.square());

        System.out.println("Введите координаты центра второй окружности: ");
        x = in.nextDouble();
        y = in.nextDouble();
        a = new Point(x, y);

        System.out.println("Введите длину радиуса второй окружности: ");
        radius = in.nextDouble();
        Circle circle2 = new Circle(a, radius);

        System.out.print("Результат сравнения первой окружности со второй: " + circle1.compareTo(circle2));
    }
}
