package lab26;

import java.util.ArrayList;
import java.util.Set;

public class PriorityQueue {
    private ArrayList<String[]> queue = new ArrayList<>();

    public void push(String key, String value) {
        queue.add(new String[]{key, value});
    }

    public String[] pop() {
        if(queue.size() == 0) {
            return null;
        }
        int min = Integer.parseInt(queue.get(0)[1]);
        for(int i = 1; i < queue.size(); i++) {
            if (Integer.parseInt(queue.get(i)[1]) < min) {
                min = Integer.parseInt(queue.get(i)[1]);
            }
        }
        for(int i = 0; i < queue.size(); i++) {
            if (Integer.parseInt(queue.get(i)[1]) == min) {
                return queue.remove(i);
            }
        }
        return null;
    }

    public String[] peek() {
        if(queue.size() == 0) {
            return null;
        }
        int min = Integer.parseInt(queue.get(0)[1]);
        for(int i = 1; i < queue.size(); i++) {
            if (Integer.parseInt(queue.get(i)[1]) < min) {
                min = Integer.parseInt(queue.get(i)[1]);
            }
        }
        for(int i = 0; i < queue.size(); i++) {
            if (Integer.parseInt(queue.get(i)[1]) == min) {
                return queue.get(i);
            }
        }
        return null;
    }
}
