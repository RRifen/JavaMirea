package lab26;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        hashtab ht = new hashtab();
        ht.hashtabInit();
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите действие: 1 - добавить запись, 2 - поиск записи, 3 - удалить запись, 4 - выход, 5 - очередь с приоритетом");
            System.out.print("-> ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите ключ: ");
                    String key = in.next();
                    System.out.print("Введите значение: ");
                    String value = in.next();
                    ht.hashtabAdd(key, value);
                    break;
                case 2:
                    System.out.print("Введите ключ: ");
                    key = in.next();
                    String outputLook = ht.hashtabDelete(key);
                    System.out.println(outputLook == null ? "Запись не найдена" : outputLook + " найден");
                    break;
                case 3:
                    System.out.print("Введите ключ: ");
                    key = in.next();
                    String output = ht.hashtabDelete(key);
                    System.out.println(output == null ? "Запись не найдена" : output + " удален");
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    PriorityQueue pq = new PriorityQueue();
                    pq.push("first", "10");
                    pq.push("second", "1");
                    pq.push("third", "2");
                    pq.push("fourth", "3");
                    pq.push("fifth", "4");
                    pq.push("sixth", "5");
                    pq.push("seventh", "6");
                    pq.push("eighth", "7");
                    pq.push("ninth", "8");
                    pq.push("tenth", "9");
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    System.out.println(pq.pop()[0]);
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        }
    }
}
