package lab09.Task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        ArrayList<Student> students = new ArrayList<Student>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int count = in.nextInt();
        for(int i = 0; i < count; i++) {
            students.add(new Student(random.nextInt(9) + 1));
            System.out.print(students.get(i) + " ");
        }
        System.out.println();
        sorting.quickSort(students, 0, students.size() - 1);
        for(int i = 0; i < count; i++) {
            System.out.print(students.get(i) + " ");
        }
    }
}
