package lab09.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int count = in.nextInt();
        Student[] IDNumbers = new Student[count];
        System.out.println("Вводите ID студентов");
        for(int i = 0; i < count; i++) {
            IDNumbers[i] = new Student(in.nextInt());
        }
        insertionSort(IDNumbers);
        for(int i = 0; i < IDNumbers.length; i++) {
            System.out.print(IDNumbers[i] + " ");
        }
    }

    public static void insertionSort(Comparable[] array) {
        Comparable currentItem;
        int j;
        for(int i = 1; i < array.length; i++) {
            currentItem = array[i];
            j = i - 1;
            while( j > -1 && boolFromInt( array[j].compareTo(currentItem) ) ) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = currentItem;
        }
    }

    public static boolean boolFromInt(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

}