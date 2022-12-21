package lab06.Task10;

public class Memory implements Nameable{
    private String name;

    public Memory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
