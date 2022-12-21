package lab06.Task12;

public class InsertCommand implements Command{
    private StringBuilder backup;
    private StringBuilder stringBuilder;
    private String str;

    private int offset;

    public InsertCommand(StringBuilder stringBuilder, int offset, String str) {
        this.stringBuilder = stringBuilder;
        this.offset = offset;
        this.str = str;
    }

    public StringBuilder execute() {
        backup = new StringBuilder(stringBuilder);
        return stringBuilder.insert(offset, str);
    }

    @Override
    public StringBuilder undo() {
        return backup;
    }
}
