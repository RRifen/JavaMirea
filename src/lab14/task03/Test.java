package lab14.task03;

import com.sun.source.tree.PatternTree;

import java.sql.ParameterMetaData;
import java.sql.SQLOutput;
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
        System.out.println("Извлекаем цены в USD, RUB, EU");
        Pattern p = Pattern.compile("\\d+\\.?\\d* (USD|RUB|EU)");
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
