package lab08.Task7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число (для нахождения простых делителей): ");
        findMultipliers(in.nextInt());
    }

    public static void findMultipliers(int number) {
        for(int i = 2; i < (int)Math.sqrt(number) + 1; i++) {
            if (number == 1) {
                return;
            }
            if (number % i == 0) {
                System.out.println(i);
                findMultipliers(number / i);
                return;
            }
        }
        System.out.println(number);
    }
}
