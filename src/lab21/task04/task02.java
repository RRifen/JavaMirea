package lab21.task04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task02 {

    public static void readAllDirectory(String path) {
        File file = new File(path);
        ArrayList<File> files;
        if (file.exists() && file.isDirectory()) {
            files = new ArrayList<>(Arrays.asList(file.listFiles()));
            int count = 0;
            for(File it : files) {
                System.out.println(it);
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        else {
            System.out.println("Папка не найдена");
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите путь к папке (D:\\2 курс\\1 сем\\Java\\Практики): ");
        String path = new Scanner(System.in).nextLine();
        readAllDirectory(path);
    }
}
