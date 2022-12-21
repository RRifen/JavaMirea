package lab27;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ruslan)", "Ivanov");
//        map.put("Ivan", "Ivanov");
//        map.put("Ivan", "Ivanov");
        map.put("Ivan", "Ivanov");
        map.put("Ruslan", "Ruslanov");
        map.put("Petr", "Petrov");
        map.put("Sergey", "Ruslanov");
        map.put("Jora", "Ivanov");
        map.put("Oleg", "Ivanov");
        map.put("Sasha", "Ivanov");
        map.put("Vasya", "Popov");
        map.put("Alexey", "Smirnov");
        map.put("Anatoliy", "Ershov");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        HashMap<String, Integer> names = new HashMap<>();
        for(Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getKey();
            if (names.containsKey(name)) {
                if (names.get(name) == 0) {
                    names.put(name, names.get(name) + 2);
                }
                else {
                    names.put(name, names.get(name) + 1);
                }
            }
            else {
                names.put(name, 0);
            }
        }
        int sum = 0;
        for(Map.Entry<String, Integer> entry : names.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        HashMap<String, Integer> lastNames = new HashMap<>();
        for(Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getValue();
            if (lastNames.containsKey(name)) {
                if (lastNames.get(name) == 0) {
                    lastNames.put(name, lastNames.get(name) + 2);
                }
                else {
                    lastNames.put(name, lastNames.get(name) + 1);
                }
            }
            else {
                lastNames.put(name, 0);
            }
        }
        int sum = 0;
        for(Map.Entry<String, Integer> entry : lastNames.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        try(FileWriter writer = new FileWriter("output.txt", false))
        {
            writer.write("Число одинаковых имен: " + getSameFirstNameCount(map) + "\n");
            writer.write("Число одинаковых фамилий: " + getSameLastNameCount(map));
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
