package lab02.Task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите строку");
        String str = in.nextLine();
        String[] words = str.split(" ");
        int length = words.length;
        for (String word : words) {
            if (word.equals("")) {
                --length;
            }
        }
        System.out.println("Количество слов: " + length);
    }
}
