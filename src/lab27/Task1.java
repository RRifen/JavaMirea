package lab27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        map.add("first");
        map.add("second");
        map.add("third");
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(map);
        Iterator<String> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
