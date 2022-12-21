package lab10.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class TestMerge {

    public static ArrayList<Student> IDNumberOne;
    public static ArrayList<Student> IDNumberTwo;

    public static void main(String[] args) {
        setArrayOne();
        setArrayTwo();
        Scanner in = new Scanner(System.in);
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
            ArrayList<Student> merging = new ArrayList<Student>();
            merging.addAll(IDNumberOne);
            merging.addAll(IDNumberTwo);
            mergeSort(merging, 0, merging.size() - 1, cmp);
            outArray(merging);
        }
    }

    public static void outArray(ArrayList<Student> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void setArrayOne() {
        System.out.print("Введите количество студентов: ");
        int count;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        IDNumberOne = new ArrayList<Student>();
        String name;
        double GPA;
        for(int i = 0; i < count; i++) {
            System.out.print("Имя: ");
            name = in.next();
            System.out.print("Средние оценки: ");
            GPA = in.nextDouble();
            System.out.println();
            IDNumberOne.add(new Student(GPA, name, generateRandomString(new Random().nextInt(10) + 1),
                    generateRandomString(new Random().nextInt(10) + 1), new Random().nextInt(4) + 1,
                    generateRandomString(new Random().nextInt(10) + 1)));
        }
    }

    public static void setArrayTwo() {
        System.out.print("Введите количество студентов: ");
        int count;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        IDNumberTwo = new ArrayList<Student>();
        String name;
        double GPA;
        for(int i = 0; i < count; i++) {
            System.out.print("Имя: ");
            name = in.next();
            System.out.print("Средние оценки: ");
            GPA = in.nextDouble();
            System.out.println();
            IDNumberTwo.add(new Student(GPA, name, generateRandomString(new Random().nextInt(10) + 1),
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

    public static void mergeSort(ArrayList<Student> list, int left, int right, Comparator<Student> cmp) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(list, left, middle, cmp);
            mergeSort(list, middle + 1, right, cmp);

            merge(list, left, middle, right, cmp);
        }
    }

    public static void merge(ArrayList<Student> list, int left, int middle, int right, Comparator<Student> cmp) {
        int count1 = middle - left + 1;
        int count2 = right - middle;

        ArrayList<Student> leftList = new ArrayList<Student>(count1);
        ArrayList<Student> rightList = new ArrayList<Student>(count2);

        for(int i = 0; i < count1; i++) {
            leftList.add(list.get(left + i));
        }

        for (int i = 0; i < count2; i++) {
            rightList.add(list.get(middle + 1 + i));
        }

        int firstPointer = 0;
        int secondPointer = 0;
        int generalPointer = left;

        while(firstPointer < count1 && secondPointer < count2) {
            if ( !boolFromInt( cmp.compare(leftList.get( firstPointer), rightList.get( secondPointer ) ) ) ) {
                list.set(generalPointer, leftList.get(firstPointer));
                ++firstPointer;
            }
            else {
                list.set(generalPointer, rightList.get(secondPointer));
                ++secondPointer;
            }
            ++generalPointer;
        }

        while (firstPointer < count1) {
            list.set(generalPointer, leftList.get(firstPointer));
            ++generalPointer;
            ++firstPointer;
        }

        while (secondPointer < count2) {
            list.set(generalPointer, rightList.get(secondPointer));
            ++generalPointer;
            ++secondPointer;
        }

    }

    public static boolean boolFromInt(int i) {
        return i > 0;
    }

}
