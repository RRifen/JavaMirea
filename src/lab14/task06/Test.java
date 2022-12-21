package lab14.task06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите email");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Pattern p = Pattern.compile("[\\w]+@[\\w.]+");
        if (p.matcher(input).matches()) {
            System.out.println("Email введен правильно");
        }
        else {
            System.out.println("Email введен неправильно");
        }
    }
}
