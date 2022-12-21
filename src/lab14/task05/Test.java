package lab14.task05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите дату");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Pattern p = Pattern.compile("(29/02/[2-9][0-9](([02468][048])|([13579][26])))|((([0-1][1-9])|(2[2-8]))/02/(([2-9][0-9][0-9][0-9])|(19[0-9][0-9])))|(((31/(01|03|05|07|08|10|12))|((([1-2][0-9])|(30|([0-2][1-9])))/((0[13456789])|(11)|(12))))/(([2-9][0-9][0-9][0-9])|(19[0-9][0-9])))");
        if (p.matcher(input).matches()) {
            System.out.println("Дата введена верно");
        }
        else {
            System.out.println("Дата введена неверно");
        }
    }
}
