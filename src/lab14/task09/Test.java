package lab14.task09;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст (признак завершения - пустая строка)");
        StringBuilder text = new StringBuilder();
        String input = in.nextLine();
        while(!input.isEmpty()) {
            text.append(input);
            input = in.nextLine();
        }
        FrequencyAnalysator.Analyse(text.toString());
    }
}
