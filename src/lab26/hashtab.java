package lab26;

import java.util.ArrayList;
import java.util.HashMap;

public class hashtab {
    private ArrayList<ArrayList<String[]>> map;

    public int hashtabHash(String key) {
        return key.hashCode() % 1000;
    }

    public void hashtabInit() {
        map = new ArrayList<>(1000);
        for(int i = 0; i < 1000; i++) {
            map.add(new ArrayList<>());
        }
    }

    public void hashtabAdd(String key, String value) {
        ArrayList<String[]> list = map.get(hashtabHash(key));
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i)[0].equals(key)) {
                list.get(i)[1] = value;
                return;
            }
        }
        map.get(hashtabHash(key)).add(new String[]{key, value});
    }

    public String hashtabLookup(String key) {
        ArrayList<String[]> lo = map.get(hashtabHash(key));
        for (int i = 0; i < lo.size();i++) {
            if (lo.get(i)[0].equals(key)) {
                return lo.get(i)[1];
            }
        }
        return null;
    }

    public String hashtabDelete(String key) {
        ArrayList<String[]> lo = map.get(hashtabHash(key));
        for (int i = 0; i < lo.size();i++) {
            if (lo.get(i)[0].equals(key)) {
                String value = lo.get(i)[1];
                lo.remove(i);
                return value;
            }
        }
        return null;
    }
}
