package lab14.task02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        if (Pattern.matches("abcdefghijklmnopqrstuv18340", input)) {
            System.out.println("Соответствует");
        }
        else {
            System.out.println("Не соответствует");
        }
    }
}
