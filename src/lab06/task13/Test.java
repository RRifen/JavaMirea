package lab06.task13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        StringBuilderMy stringBuilderMy = new StringBuilderMy(new StringBuilder(in.next()));
        stringBuilderMy.events.subscribe("Replace", new ReplaceListener());
        stringBuilderMy.events.subscribe("Replace", new EchoListener());
        stringBuilderMy.events.subscribe("Insert", new EchoListener());
        stringBuilderMy.events.subscribe("Delete", new EchoListener());
        stringBuilderMy.events.subscribe("Append", new EchoListener());
        while (true) {
            System.out.println("Выберите операцию: \n1 - вставить строку в конец (append)\n2 - удалить подстроку (delete) " +
                    "\n3 - вставить подстроку (insert)\n4 - заменить подстроку (replace)" +
                    "\n5 - вывести строку");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите строку для вставки в конец");
                    String appendString = in.next();
                    stringBuilderMy.append(appendString);
                    break;
                case 2:
                    System.out.println("Введите первый индекс для удаления");
                    int start = in.nextInt();
                    System.out.println("Введите последний индекс для удаления (не включительно)");
                    int end = in.nextInt();
                    stringBuilderMy.delete(start, end);
                    break;
                case 3:
                    System.out.println("Введите стркоу для вставки");
                    String strIns = in.next();
                    System.out.println("Введите индекс вставки");
                    int offset = in.nextInt();
                    stringBuilderMy.insert(offset, strIns);
                    break;
                case 4:
                    System.out.println("Введите стркоу для вставки");
                    String strReplace = in.next();
                    System.out.println("Введите первый индекс заменяемой подстроки");
                    int startReplace = in.nextInt();
                    System.out.println("Введите послдений индекс заменяемой строки (не включительно)");
                    int endReplace = in.nextInt();
                    stringBuilderMy.replace(startReplace, endReplace, strReplace);
                    break;
                case 5:
                    System.out.println(stringBuilderMy);
                    break;
                default:
                    break;
            }
        }
    }
}
