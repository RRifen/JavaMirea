package lab02.Task3;

import java.util.Scanner;

public class Tester {
    private static Circle[] circles;
    private static int length;

    public Tester() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число объектов Circle: ");
        length = in.nextInt();
        circles = new Circle[length];
        System.out.println("Вводите координаты точек и радиус (формат: x y r)");

        for(int i = 0; i < length; ++i) {
            circles[i] = new Circle(in.nextDouble(), in.nextDouble(), in.nextInt());
        }

        Circle[] var6 = circles;
        int var3 = var6.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Circle i = var6[var4];
            System.out.println(i);
        }

    }
}