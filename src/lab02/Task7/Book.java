package lab02.Task7;

public class Book implements Comparable<Book>{
    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.getYear(), book.getYear());
    }

    @Override
    public String toString() {
        return "Book {" +
                "author: " + author +
                "; name: " + name +
                "; year: " + year +
                "}";
    }

}
