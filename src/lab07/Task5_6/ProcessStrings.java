package lab07.Task5_6;

public class ProcessStrings implements Stringable{
    @Override
    public int countSymbols(String str) {
        return str.length();
    }

    @Override
    public String oddSymbols(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i+=2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String str) {
        StringBuilder revers = new StringBuilder(str);
        revers.reverse();
        return revers.toString();
    }
}
