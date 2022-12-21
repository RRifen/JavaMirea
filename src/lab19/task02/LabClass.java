package lab19.task02;

import java.util.ArrayList;
import java.util.Random;

public class LabClass {

    public ArrayList<Comparable> getList() {
        return list;
    }

    ArrayList<Comparable> list;

    public LabClass() {
        list = new ArrayList<>();
    }
    public void quickSort() {
        quickSort(0, list.size() - 1);
    }
    public void quickSort(int low, int high) {
        if (low < high) {
            Comparable pivot = list.get(high);
            Comparable temp;
            int i = low - 1;
            for(int j = low; j < high; j++) {
                if ( boolFromInt( pivot.compareTo(list.get(j))) ) {
                    i++;
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
            temp = list.get(i + 1);
            list.set(i + 1, list.get(high));
            list.set(high, temp);
            int middle = i + 1;
            quickSort(low, middle - 1);
            quickSort(middle + 1, high);
        }
    }

    public void addStudent(Comparable student) throws EmptyStringException {
        list.add(student);
    }
    public void generateStudents(int n) {
        list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(new Student(generateRandomString(random.nextInt(10) + 1), Math.random() * 5));
        }
    }

    public Student findStudent(String FIO) throws StudentNotFoundException{
        for (int i = 0; i < list.size(); i++) {
            if (((Student)list.get(i)).getFIO().equals(FIO)) {
                return (Student)list.get(i);
            }
        }
        throw new StudentNotFoundException("Студент не найден");
    }

    public static String generateRandomString(int length) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftLimit + random.nextInt(rightLimit - leftLimit + 1);
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    public boolean boolFromInt(int i) {
        return i > 0;
    }
}
