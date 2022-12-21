package lab06.Task12;

public class ReplaceCommand implements Command {
    private StringBuilder backup;
    private StringBuilder stringBuilder;
    private String str;

    private int start;
    private int end;

    public ReplaceCommand(StringBuilder stringBuilder, int start, int end, String str) {
        this.stringBuilder = stringBuilder;
        this.start = start;
        this.end = end;
        this.str = str;
    }

    public StringBuilder execute() {
        backup = new StringBuilder(stringBuilder);
        return stringBuilder.replace(start, end, str);
    }

    @Override
    public StringBuilder undo() {
        return backup;
    }
}
