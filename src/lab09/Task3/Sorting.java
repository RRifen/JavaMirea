package lab09.Task3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        ArrayList<Student> first = new ArrayList<Student>();
        ArrayList<Student> second = new ArrayList<Student>();

        System.out.print("Введите размер первого списка: ");
        int firstSize = in.nextInt();
        System.out.print("Первый список: ");
        for(int i = 0; i < firstSize; i++) {
            first.add(new Student(random.nextInt(100) + 10));
            System.out.print(first.get(i) + " ");
        }
        System.out.println();

        System.out.print("Введите размер второго списка: ");
        int secondSize = in.nextInt();
        System.out.print("Второй список: ");
        for(int i = 0; i < secondSize; i++) {
            second.add(new Student(random.nextInt(90) + 10));
            System.out.print(second.get(i) + " ");
        }
        System.out.println();

        ArrayList<Comparable> result = new ArrayList<Comparable>(firstSize + secondSize);
        for(int i = 0; i < firstSize; i++) {
            result.add(first.get(i));
        }
        for(int j = 0; j < secondSize; j++) {
            result.add(second.get(j));
        }

        mergeSort(result, 0, result.size() - 1);

        System.out.print("Отсортированный список: ");
        for(int i = 0; i < firstSize + secondSize; i++) {
            System.out.print((Student)result.get(i) + " ");
        }
    }

    public static boolean boolFromInt(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }
    public static void mergeSort(ArrayList<Comparable> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);

            merge(list, left, middle, right);
        }
    }

    public static void merge(ArrayList<Comparable> list, int left, int middle, int right) {
        int count1 = middle - left + 1;
        int count2 = right - middle;

        ArrayList<Comparable> leftList = new ArrayList<Comparable>(count1);
        ArrayList<Comparable> rightList = new ArrayList<Comparable>(count2);

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
            if ( !boolFromInt( leftList.get( firstPointer).compareTo( rightList.get( secondPointer ) ) ) ) {
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

}
