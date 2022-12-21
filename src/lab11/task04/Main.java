package lab11.task04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, month, dayOfMonth, hour, minutes;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        year = in.nextInt();
        System.out.print("Введите месяц: ");
        month = in.nextInt();
        System.out.print("Введите число: ");
        dayOfMonth = in.nextInt();
        System.out.print("Введите текущий час: ");
        hour = in.nextInt();
        System.out.print("Введите количество минут: ");
        minutes = in.nextInt();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(GregorianCalendar.YEAR, year);
        gregorianCalendar.set(GregorianCalendar.MONTH, month);
        gregorianCalendar.set(GregorianCalendar.DAY_OF_MONTH, dayOfMonth);
        gregorianCalendar.set(GregorianCalendar.HOUR_OF_DAY, hour);
        gregorianCalendar.set(GregorianCalendar.MINUTE, minutes);
        Date date = gregorianCalendar.getTime();
        System.out.println(date);
    }
}
