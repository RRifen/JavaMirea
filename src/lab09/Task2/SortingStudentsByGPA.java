package lab09.Task2;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public void quickSort(ArrayList<Student> list, int low, int high) {
        if (low < high) {
            Student pivot = list.get(high);
            Student temp;
            int i = low - 1;
            for(int j = low; j < high; j++) {
                if ( boolFromInt( compare(pivot, list.get(j)) ) ) {
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
            quickSort(list, low, middle - 1);
            quickSort(list, middle + 1, high);
        }
    }
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getGPA(), o1.getGPA());
    }

    public boolean boolFromInt(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }
}
