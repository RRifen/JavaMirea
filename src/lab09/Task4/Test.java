package lab09.Task4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        LongString firstLongString = new LongString(in.next());
        System.out.print("Введите вторую строку: ");
        LongString secondLongString = new LongString(in.next());
        System.out.println("Результат их сравнения: " + firstLongString.compareTo(secondLongString));
    }
}
