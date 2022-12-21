package lab11.task03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Введите имя студента: ");
                String name = in.next();
                System.out.print("Введите год рождения студента: ");
                int year = in.nextInt();
                System.out.print("Введите месяц рождения студента (число): ");
                int month = in.nextInt();
                System.out.print("Введите день рождения студента: ");
                int day = in.nextInt();
                GregorianCalendar birthDay = new GregorianCalendar();
                birthDay.set(GregorianCalendar.YEAR, year);
                birthDay.set(GregorianCalendar.MONTH, month - 1);
                birthDay.set(GregorianCalendar.DAY_OF_MONTH, day);
                System.out.print("Выберите формат вывода даты (0 - короткий, 1 - средний, 2 - полный): ");
                int format = in.nextInt();
                Student student = new Student(0, name, "", "", 2, "", birthDay);
                student.setFormat(format);
                System.out.println(student + "\n");
            }
        } catch (Exception ignored) {

        }
    }
}
