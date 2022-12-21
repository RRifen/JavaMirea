package lab07.Task4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Введите действительную часть комплексного числа: ");
        Scanner in = new Scanner(System.in);
        double re = in.nextDouble();
        System.out.print("Введите мнимую часть комплексного числа: ");
        double im = in.nextDouble();
        Complex complex = new Complex(re, im);
        MathFunc mf = new MathFunc();
        System.out.println("Модуль комплексного числа: " + mf.absComplex(complex));
        System.out.print("Введите число и степень, в которую его необходимо возвести: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Результат: " + mf.pow(a, b));
        System.out.print("Введите радиус окружности: ");
        int radius = in.nextInt();
        System.out.println("Длина окружности: " + mf.findCircumference(radius));
    }
}
