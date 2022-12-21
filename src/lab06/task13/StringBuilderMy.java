package lab06.task13;

public class StringBuilderMy {
    public EventManager events;
    @Override
    public String toString() {
        return stringBuilder.toString();
    }
    public StringBuilderMy(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
        events = new EventManager("Replace", "Insert", "Delete", "Append");
    }
    private StringBuilder stringBuilder;

    public void append(String str) {
        stringBuilder.append(str);
        events.notify("Append");
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        events.notify("Delete");
    }

    public void replace(int start, int end, String str) {
        stringBuilder.replace( start, end, str);
        events.notify("Replace");
    }

    public void insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        events.notify("Insert");
    }
}