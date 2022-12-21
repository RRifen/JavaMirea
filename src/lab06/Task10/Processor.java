package lab06.Task10;

public class Processor implements Nameable {
    private String name;

    public Processor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
