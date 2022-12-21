package lab13.task02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.println("Введите отчество: ");
        String patronymic = in.nextLine();
        Person person = new Person(name, surname, patronymic);
        System.out.println(person.getFullName());
    }
}
