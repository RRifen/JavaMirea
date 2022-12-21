package lab14.task01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        do {
            System.out.println("Введите регулярное выражение, которое соответствует разделителю");
            Scanner in = new Scanner(System.in);
            String regex = in.next();
            System.out.println("Введите строку, которую необходимо разделить, используя регулярное выражение");
            String input = in.next();
            String[] strings = input.split(regex);
            for(String str : strings) {
                System.out.println(str);
            }
        } while (true);
    }
}
