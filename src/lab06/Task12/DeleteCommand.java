package lab06.Task12;

public class DeleteCommand implements Command{
    private StringBuilder backup;
    private StringBuilder stringBuilder;
    private String str;

    private int start;
    private int end;

    public DeleteCommand(StringBuilder stringBuilder, int start, int end) {
        this.stringBuilder = stringBuilder;
        this.start = start;
        this.end = end;
    }

    public StringBuilder execute() {
        backup = new StringBuilder(stringBuilder);
        return stringBuilder.delete(start, end);
    }

    @Override
    public StringBuilder undo() {
        return backup;
    }
}
