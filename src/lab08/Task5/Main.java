package lab08.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();
        System.out.println(sum(number));
    }

    public static int sum(int number) {
        if (number == 0) {
            return 0;
        }

        return number % 10 + sum(number / 10);
    }
}
