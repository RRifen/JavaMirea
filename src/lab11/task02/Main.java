package lab11.task02;

import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Введите дату и время (Unix Time, число миллисекунд): ");
                long userTime = in.nextLong();
                Date userDate = new Date(userTime);
                System.out.println(userDate);
                if (userDate.after(new Date(System.currentTimeMillis()))) {
                    System.out.println("Введенная дата следует после текущей\n");
                } else if (userDate.before(new Date(System.currentTimeMillis()))) {
                    System.out.println("Введенная дата находится до текущей\n");
                } else {
                    System.out.println("Дата совпадает с текущей\n");
                }
            }
        }
        catch (Exception ignored) {
        }
    }
}
