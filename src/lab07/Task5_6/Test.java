package lab07.Task5_6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings();
        System.out.print("Введите строку: ");
        String str;
        Scanner in = new Scanner(System.in);
        str = in.next();
        System.out.println("Количество символов в строке: " + processStrings.countSymbols(str));
        System.out.println("Строка с символами на нечетных индексах: " + processStrings.oddSymbols(str));
        System.out.println("Инвертированная строка: " + processStrings.reverseString(str));
    }
}
