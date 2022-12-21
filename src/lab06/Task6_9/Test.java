package lab06.Task6_9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число объектов: ");

        int count = in.nextInt();
        Printable[] prints = new Printable[count];

        int choice;
        for (int i = 0; i < count; i++) {
            System.out.print("Выберите тип объекта: 1 - Book, 2 - Shop: ");
            choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Введите название Book: ");
                    prints[i] = new Book(in.next());
                }
                case 2 -> {
                    System.out.print("Введите название Shop: ");
                    prints[i] = new Shop(in.next());
                }
                default -> {
                    System.out.println("Чего?");
                    --i;
                }
            }
        }

        for(Printable i: prints) {
            i.print();
        }
    }
}
