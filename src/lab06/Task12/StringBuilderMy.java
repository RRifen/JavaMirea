package lab06.Task12;

import java.lang.StringBuilder;
public class StringBuilderMy {
    private CommandHistory history = new CommandHistory();

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    private StringBuilder stringBuilder;

    StringBuilderMy(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void append(String str) {
        executeCommand(new AppendCommand(stringBuilder, str));
    }

    public void delete(int start, int end) {
        executeCommand(new DeleteCommand(stringBuilder, start, end));
    }

    public void replace(int start, int end, String str) {
        executeCommand(new ReplaceCommand(stringBuilder, start, end, str));
    }

    public void insert(int offset, String str) {
        executeCommand(new InsertCommand(stringBuilder, offset, str));
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (history.isEmpty()) {return;}
        Command command = history.pop();

        if (command != null) {
            stringBuilder = command.undo();
        }
    }

}
