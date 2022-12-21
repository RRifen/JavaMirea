package lab19.task02;

import java.util.ArrayList;
import java.util.Scanner;

public class LabClassUI {

    Scanner in;
    LabClass labClass;

    public LabClassUI() {
        in = new Scanner(System.in);
        labClass = new LabClass();
    }

    public void inputStudents() {
        System.out.print("Введите количество студентов: ");
        int count = Integer.parseInt(in.nextLine());
        for(int i = 0; i < count; i++) {
            System.out.print("Введите ФИО студента: ");
            String name = in.nextLine();
            System.out.print("Введите GPA студента: ");
            double gpa;
            try {
                gpa = Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат GPA! Попробуйте еще раз.");
                i--;
                continue;
            }
            try {
                labClass.addStudent((Comparable) new Student(name, gpa));
            } catch (EmptyStringException e) {
                System.out.println(e.getMessage() + "! Попробуйте еще раз.");
                i--;
            }
            System.out.println();
        }
    }

    public void generateStudents() {
        System.out.print("Введите количество студентов: ");
        int count = Integer.parseInt(in.nextLine());
        labClass.generateStudents(count);
    }

    public void printStudents() {
        ArrayList<Comparable> students = labClass.getList();
        for(int i = 0; i < students.size(); i++) {
            System.out.println((Student)students.get(i));
        }
    }

    public void sortStudents() {
        labClass.quickSort();
        printStudents();
    }

    public void findStudent() {
        System.out.print("Введите ФИО студента: ");
        String name = in.nextLine();
        try {
            System.out.println("Студент найден: " + labClass.findStudent(name));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    public void dialog() {
        while(true) {
            System.out.print("Выберите действие:\n1 - Добавить студентов в массив\n2 - Сгенерировать массив\n3 - Вывести массив\n4 - Отсортировать и вывести массив\n5 - Поиск студента по ФИО\n6 - Выйти\n-> ");
            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1 -> inputStudents();
                case 2 -> generateStudents();
                case 3 -> printStudents();
                case 4 -> sortStudents();
                case 5 -> findStudent();
                case 6 -> System.exit(0);
                default -> System.out.println("Неверный ввод\n\n");
            }
        }
    }
}
