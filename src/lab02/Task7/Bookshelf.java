package lab02.Task7;

import java.util.ArrayList;
import java.util.Collections;

public class Bookshelf{
    private final ArrayList<Book> books;
    private int amount = 0;

    public Bookshelf() {
        books = new ArrayList<>(amount);
    }

    public void addBook(String author, String name, int year) {
        books.add(new Book(author, name, year));
        amount++;
    }

    public Book earliestYear() {
        int min;
        Book latestBook;
        min = books.get(0).getYear();
        latestBook = books.get(0);
        for (int i = 1; i < amount; i++) {
            if (books.get(i).getYear() < min) {
                min = books.get(i).getYear();
                latestBook = books.get(i);
            }
        }
        return latestBook;
    }

    public Book latestYear() {
        int max;
        Book earliestBook = books.get(0);
        max = books.get(0).getYear();
        earliestBook = books.get(0);
        for (int i = 1; i < amount; i++) {
            if (books.get(i).getYear() > max) {
                max = books.get(i).getYear();
                earliestBook = books.get(i);
            }
        }
        return earliestBook;
    }

    public void sortAscendingYear() {
        Collections.sort(books);
    }

    public void printBooks() {
        for(int i = 0; i < amount; i++) {
            System.out.println(books.get(i));
        }
    }

}