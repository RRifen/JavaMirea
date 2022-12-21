package lab08.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k, s;
        System.out.print("Введите количество цифр в числе: ");
        k = in.nextInt();
        System.out.print("Введите требуюмую сумму: ");
        s = in.nextInt();
        System.out.println(wrapper(k, s));
    }

    public static int wrapper(int k, int s) {
        int count = 0;
        for(int i = 1; i < 10; i++) {
            count += counter(k - 1, s - i);
        }
        return count;
    }

    public static int counter(int k, int s) {
        if (s == 0) {
            return 1;
        }
        if (s < 0) {
            return 0;
        }
        if (k == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 10; i++) {
             count += counter(k - 1, s - i);
        }
        return count;
    }
}

/*

//Для проверки

import java.util.Scanner;
        import java.lang.Math;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        int count = 0;

        for(int i = (int)Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            if (sum_of_numbers(i) == s) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int sum_of_numbers(int number) {
        int quont = number;
        int mod = 0;
        int sum = 0;
        while(quont != 0) {
            mod = quont % 10;
            sum += mod;
            quont /= 10;
        }
        return sum;
    }
}

 */
