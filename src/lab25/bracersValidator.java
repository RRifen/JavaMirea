package lab25;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bracersValidator {
    public static void main(String[] args) {
        Pattern patternStart = Pattern.compile("\\(");
        Pattern patternEnd = Pattern.compile("\\)");
        String[] trueTests = {"(3*+*5)*–*9*×*4", "()", "(()())", "(a)b(c)"};
        String[] falseTests = {"((3*+*5)*–*9*×*4", "(()", "a)b(c)", "())"};
        for(String test : trueTests) {
            Matcher matcherStart = patternStart.matcher(test);
            Matcher matcherEnd = patternEnd.matcher(test);
            boolean isBreak = false;
            boolean startMatch = false;
            boolean endMatch = false;
            while(true) {
                startMatch = matcherStart.find();
                endMatch = matcherEnd.find();
                if (!startMatch && !endMatch) {
                    break;
                }
                if (!startMatch || !endMatch) {
                    System.out.println(test + ": " + "false");
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                System.out.println(test + ": " + "true");
            }
        }
        for(String test : falseTests) {
            Matcher matcherStart = patternStart.matcher(test);
            Matcher matcherEnd = patternEnd.matcher(test);
            boolean isBreak = false;
            boolean startMatch = false;
            boolean endMatch = false;
            while(true) {
                startMatch = matcherStart.find();
                endMatch = matcherEnd.find();
                if (!startMatch && !endMatch) {
                    break;
                }
                if (!startMatch || !endMatch) {
                    System.out.println(test + ": " + "false");
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                System.out.println(test + ": " + "true");
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражения для проверки: ");
        String test = in.next();
        Matcher matcherStart = patternStart.matcher(test);
        Matcher matcherEnd = patternEnd.matcher(test);
        boolean isBreak = false;
        boolean startMatch = false;
        boolean endMatch = false;
        while(true) {
            startMatch = matcherStart.find();
            endMatch = matcherEnd.find();
            if (!startMatch && !endMatch) {
                break;
            }
            if (!startMatch || !endMatch) {
                System.out.println(test + ": " + "false");
                isBreak = true;
                break;
            }
        }
        if (!isBreak) {
            System.out.println(test + ": " + "true");
        }
    }
}
