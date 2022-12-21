package lab14.task07;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Test {
    public static void main(String[] args) {
        System.out.print("Введите пароль: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Pattern bigLetter = Pattern.compile("[A-Z]");
        Pattern smallLetter = Pattern.compile("[a-z]");
        Pattern digit = Pattern.compile("\\d");
        Pattern password = Pattern.compile("[A-Za-z0-9_]{8,}");
        if (password.matcher(input).matches()) {
            if (!bigLetter.matcher(input).find()) {
                System.out.println("В пароле должна быть хотя бы одна большая буква");
            }
            else if (!smallLetter.matcher(input).find()) {
                System.out.println("В пароле должна быть хотя бы одна маленькая буква");
            }
            else if (!digit.matcher(input).find()) {
                System.out.println("В пароле должна быть хотя бы одна цифра");
            }
            else {
                System.out.println("Пароль надежный");
            }
        }
        else {
            System.out.println("Пароль должен состоять только из английских букв, цифр и знаков подчеркивания. Минимальная длина пароля: 8 символов");
        }
    }
}
