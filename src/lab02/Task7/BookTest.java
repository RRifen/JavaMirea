package lab02.Task7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount;

        System.out.print("Введите количество книг: ");
        amount = in.nextInt();
        Bookshelf bs = new Bookshelf();

        System.out.println("Вводите книги");
        String author;
        String name;

        int year;
        for (int i = 0; i < amount; i++) {
            System.out.print("Введите автора: ");
            author = in.next();
            System.out.print("Введите название книги: ");
            name = in.next();
            System.out.print("Введите год издания: ");
            year = in.nextInt();
            bs.addBook(author, name, year);
        }

        System.out.print("Самое позднее издание: ");
        System.out.println(bs.latestYear());

        System.out.print("Самое раннее издание: ");
        System.out.println(bs.earliestYear());

        System.out.println("Книги в отсортированном порядке");
        bs.sortAscendingYear();
        bs.printBooks();
    }


}
