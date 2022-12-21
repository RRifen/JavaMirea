package lab08.Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner in = new Scanner(System.in);
        String strInput = in.next();
        if (palindrome(strInput, 0)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean palindrome(String str, int pos) {
        if (pos >= str.length() - 1) {
            return true;
        }
        if (str.charAt(pos) != str.charAt(str.length() - 1 - pos)) {
            return false;
        }
        return palindrome(str, pos + 1);
    }
}
