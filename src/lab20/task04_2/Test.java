package lab20.task04_2;

public class Test {
    public static void main(String[] args) {
        int a = 4;
        double b = 5.5;
        float c = 6.6f;
        long d = 7;
        short e = 8;
        byte f = 9;
        System.out.println("Складываем int и double: " + a + " + " + b + " = " + Calculator.sum(a, b));
        System.out.println("Вычитаем float и long: " + c + " - " + d + " = " + Calculator.sub(c, d));
        System.out.println("Умножаем byte и short: " + f + " * " + e + " = " + Calculator.mul(f, e));
        System.out.println("Делим long и int: " + d + " / " + a + " = " + Calculator.div(d, a));
    }
}
