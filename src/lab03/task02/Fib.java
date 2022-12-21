package lab03.task02;

import java.util.*;

public class Fib {
    public static void main(String[] args) {
        int first = 0, second = 1;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int start_number = sc.nextInt();
        for(int i = 1; i < start_number; i++) {
            second += first;
            first = second - first;
        }
        for(int i = 0; i < count; i++) {
            System.out.println(first);
            second += first;
            first = second - first;
        }
    }
}