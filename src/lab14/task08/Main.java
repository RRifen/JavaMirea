package lab14.task08;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o == null) {
                    return true;
                }
                return false;
            }
        };
        String[] array = {"string", null, null, "()()()()"};
        array = (String[])filter(array, filter);
        for(String i: array) {
            System.out.println(i);
        }
    }

    public static Object[] filter(Object[] array, Filter filter) {
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if (filter.apply(array[i])) {
                j++;
            }
            else {
                array[i - j] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - j);
    }
}
