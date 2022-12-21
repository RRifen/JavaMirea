package lab09.Task4;

public class LongString implements java.lang.Comparable<LongString> {
    public LongString(String string) {
        this.string = string;
        this.length = string.length();
    }

    private final String string;
    private final int length;

    @Override
    public int compareTo(LongString o) {
        return Integer.compare(this.length, o.length);
    }
}
