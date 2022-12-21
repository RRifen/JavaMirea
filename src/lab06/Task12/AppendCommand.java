package lab06.Task12;

public class AppendCommand implements Command{
    private StringBuilder backup;
    private StringBuilder stringBuilder;
    private String str;

    public AppendCommand(StringBuilder stringBuilder, String str) {
        this.stringBuilder = stringBuilder;
        this.str = str;
    }

    public StringBuilder execute() {
        backup = new StringBuilder(stringBuilder);
        return stringBuilder.append(str);
    }

    @Override
    public StringBuilder undo() {
        return backup;
    }
}
