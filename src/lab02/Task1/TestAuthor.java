package lab02.Task1;

import java.util.Scanner;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите почту: ");
        String email = in.nextLine();
        System.out.print("Ввелите гендер: ");
        String test = in.nextLine();
        char gender = test.charAt(0);
        Author testAuthor = new Author(name, email, gender);
        System.out.println(testAuthor);
        testAuthor.setEmail("Author@yandex.ru");
        System.out.println(testAuthor);
    }
}