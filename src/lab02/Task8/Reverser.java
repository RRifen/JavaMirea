package lab02.Task8;

import java.util.*;

public class Reverser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount;
        String temp;
        System.out.print("Введите количество строк: ");
        amount = in.nextInt();
        String[] arr = new String[amount];
        System.out.println("Вводите строки");
        for (int i = 0; i < amount; i++) {
            arr[i] = in.next();
        }
        for (int i = 0; i < amount / 2; i++) {
            temp = arr[i];
            arr[i] = arr[amount - 1 - i];
            arr[amount - 1 - i] = temp;
        }
        for (int i = 0; i < amount; i++) {
            System.out.println(arr[i]);
        }
    }
}
