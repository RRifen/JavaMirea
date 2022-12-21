package lab06.Nameable;

public class Person implements Nameable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
