package lab02.Task4;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.println("Вводите названия компьютеров (0 для остановки ввода)");
        String str = in.next();
        while (!str.equals("0")){
            shop.addComp(new Computer(str));
            str = in.next();
        }

        System.out.println("Теперь вы покупатель)");
        System.out.print("Введите название компьютера: ");
        String attempt = in.next();
        Computer found = shop.search(attempt);
        if (found != null) {
            System.out.println("Компьютер " + found.getName() + " найден");
        }
        else {
            System.out.println("Компьютер не найден");
        }
    }
}
