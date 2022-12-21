package lab03.task03;

import java.util.*;

public class Systems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int systemNum = sc.nextInt();
        System.out.println(translate(number, systemNum));
        System.out.println("В двоичной системе: " + translate(number, 2));
        System.out.println("В шестанадцатиричной системе: " + translate(number, 16));
    }
    public static String translate(double number, int systemNum) {
        HashMap<Integer, Character> map = new HashMap<>();
        char ch = 'A';
        char num = '0';
        for(int i = 0; i < 10; i++) {
            map.put(i, num);
            num++;
        }
        for(int i = 10; i < 36; i++) {
            map.put(i, ch);
            ch += 1;
        }
        String result = "";
        int number_int = (int)number;
        double number_double = number - number_int;
        while(number_int > 0) {
            result = map.get(number_int % systemNum) + result;
            number_int = number_int / systemNum;
        }
        result += ".";
        for(int i = 0; (i < 3) && (number_double != 0); i++) {
            number_double = number_double * systemNum;
            result += map.get((int)number_double);
            number_double = number_double - (int)number_double;
        }
        return result;
    }
}

