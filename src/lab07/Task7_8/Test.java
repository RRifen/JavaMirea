package lab07.Task7_8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.print("Введите количество экземпляров: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Printable[] printables = new Printable[count];
        String name;
        int choice;
        for(int i = 0; i < count; i++) {
            System.out.print("Выберите тип (1 - журнал, 2 - книга): ");
            choice = in.nextInt();
            System.out.println("Введите название: ");
            name = in.next();
            if (choice == 1) {
                Magazine inst = new Magazine(name);
                printables[i] = inst;
            }
            else {
                Book inst = new Book(name);
                printables[i] = inst;
            }
        }

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
