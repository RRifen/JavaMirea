package lab06.Task6_9;

public class Book implements Printable{
    private String name;

    Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book: " + name);
    }
}
