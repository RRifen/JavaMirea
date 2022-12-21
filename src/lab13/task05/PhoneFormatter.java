package lab13.task05;

import java.util.Scanner;

public class PhoneFormatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер для форматирования: ");
            String input = in.nextLine();
            if (input.charAt(0) == '+') {
                countryFormatter(input);
            } else if (input.charAt(0) == '8') {
                russianFormatter(input);
            }
        }
    }

    public static void countryFormatter(String input) {
        String countryCode;
        String firstThreeNumbers;
        String secondThreeNumbers;
        String fourNumbers;
        String tenNumbers = input.substring(input.length() - 10, input.length());
        countryCode = input.substring(1, input.length() - 10);
        firstThreeNumbers = tenNumbers.substring(0, 3);
        secondThreeNumbers = tenNumbers.substring(3, 6);
        fourNumbers = tenNumbers.substring(6);
        System.out.println("+" + countryCode + " " + firstThreeNumbers + "-" + secondThreeNumbers + "-" + fourNumbers);
    }

    public static void russianFormatter(String input) {
        String countryCode = input.substring(0, 1);
        String firstThreeNumbers = input.substring(1, 4);
        String secondThreeNumbers = input.substring(4, 7);
        String fourNumbers = input.substring(7, 11);
        System.out.println("+" + countryCode + " " + firstThreeNumbers + "-" + secondThreeNumbers + "-" + fourNumbers);
    }
}
