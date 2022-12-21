package lab07.Task7_8;

public class Book implements Printable{
    private String name;

    Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book: " + name);
    }

    public static void printBooks(Printable[] printable) {
        for(Printable inst : printable) {
            if (inst instanceof Book) {
                inst.print();
            }
        }
    }

}
