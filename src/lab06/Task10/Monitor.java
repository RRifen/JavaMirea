package lab06.Task10;

public class Monitor implements Nameable{
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
