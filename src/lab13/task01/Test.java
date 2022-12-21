package lab13.task01;

import java.util.Scanner;

public class Test {
    public static void method(String s) {
        System.out.println("Последний символ строки: " + s.charAt(s.length() - 1));
        System.out.println("Заканчивается ли строка подстрокой !!!: " + s.endsWith("!!!"));
        System.out.println("Начинается ли строка подстркой I like: " + s.startsWith("I like"));
        System.out.println("Содержит ли строка подстроку Java: " + s.contains("Java"));
        System.out.println("Заменить все символы 'a' на 'o': " + s.replace('a', 'o'));
        System.out.println("Преобразовать строку к верхнему регистру: " + s.toUpperCase());
        System.out.println("Преобразовать строку к нижнему регистру: " + s.toLowerCase());
        System.out.println("Вырезать строку Java: " + (s.contains("Java") ? (s.substring(0, s.indexOf("Java")) + s.substring(s.indexOf("Java") + 4) ) : s));
    }

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        method(input);
    }
}
