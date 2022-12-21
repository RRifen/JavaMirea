package lab11.task05;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    private static LinkedList<Integer> linkedList;
    private static ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        System.out.println("Генерируем 10000 уникальных значений в произвольном порядке");
        generateNumbers();

        System.out.println("Тестируем операцию добавления элемента в конец списка (вставка 10000 элементов)");
        long startTime = System.nanoTime();
        for(int i = 10000; i < 20000; i++) {
            linkedList.add(i);
        }
        long estimatedTime = System.nanoTime() - startTime;;
        System.out.println("linkedList: " + estimatedTime);
        startTime = System.nanoTime();
        for(int i = 10000; i < 20000; i++) {
            arrayList.add(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList : " + estimatedTime);

        System.out.println("Тестируем операцию добавления элемента в середину списка (вставка 10000 элементов)");
        startTime = System.nanoTime();
        for(int i = 10000; i < 20000; i++) {
            linkedList.add(i, i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedList: " + estimatedTime);
        startTime = System.nanoTime();
        for(int i = 10000; i < 20000; i++) {
            arrayList.add(i, i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList : " + estimatedTime);

        System.out.println("Тестируем операцию поиска по образцу (10000 поисков)");
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            linkedList.indexOf(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedList: " + estimatedTime);
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            arrayList.indexOf(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList : " + estimatedTime);

        System.out.println("Тестируем операцию удаления элементов (10000 удалений)");
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            linkedList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedList: " + estimatedTime);
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            arrayList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList : " + estimatedTime);
    }

    public static void generateNumbers() {
        linkedList = new LinkedList<Integer>();
        arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        Collections.shuffle(linkedList);
        Collections.shuffle(arrayList);
    }
}
