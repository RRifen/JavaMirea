package lab10.Task1_2;

import java.util.*;

public class Tester {
    public static ArrayList<Student> IDNumber;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        setArray();
        outArray();
        while (true) {
            System.out.print("Выберите по какому параметру сортировать (1 - имя, 2 - GPA): ");
            int choice = in.nextInt();
            Comparator<Student> cmp;
            if (choice != 1 && choice != 2) {
                break;
            }
            if (choice == 1) {
                cmp = new StudentNameComparator();
            } else {
                cmp = new StudentGPAComparator();
            }
            quickSort(IDNumber, cmp);
            outArray();
        }
    }

    public static void outArray() {
        for(int i = 0; i < IDNumber.size(); i++) {
            System.out.println(IDNumber.get(i));
        }
    }

    public static void quickSort(ArrayList<Student> list, Comparator<Student> cmp) {
        quickSort(list, 0, list.size() - 1, cmp);
    }

    public static void quickSort(ArrayList<Student> list, int low, int high, Comparator<Student> cmp) {
        if (low < high) {
            Student pivot = list.get(high);
            Student temp;
            int i = low - 1;
            for(int j = low; j < high; j++) {
                if ( boolFromInt( cmp.compare(pivot, list.get(j)) ) ) {
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
            quickSort(list, low, middle - 1, cmp);
            quickSort(list, middle + 1, high, cmp);
        }
    }

    public static void setArray() {
        System.out.print("Введите количество студентов: ");
        int count;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        IDNumber = new ArrayList<Student>();
        String name;
        double GPA;
        for(int i = 0; i < count; i++) {
            System.out.print("Имя: ");
            name = in.next();
            System.out.print("Средние оценки: ");
            GPA = in.nextDouble();
            System.out.println();
            IDNumber.add(new Student(GPA, name, generateRandomString(new Random().nextInt(10) + 1),
                    generateRandomString(new Random().nextInt(10) + 1), new Random().nextInt(4) + 1,
                    generateRandomString(new Random().nextInt(10) + 1)));
        }
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

    public static boolean boolFromInt(int i) {
        return i > 0;
    }

}
