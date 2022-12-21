package lab14.task04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern p = Pattern.compile("\\d *\\+");
        if (p.matcher(text).find()) {
            System.out.println("В тексте есть цифра, за которой следует знак плюс");
        }
        else {
            System.out.println("В тексте нет цифры, за которой следует знак плюс");
        }
    }
}
